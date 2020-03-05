package com.bohniman.eftapi.service;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import org.hibernate.HibernateException;
import org.hibernate.MappingException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.Configurable;
import org.hibernate.id.IdentifierGenerator;
import org.hibernate.internal.util.config.ConfigurationHelper;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.type.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import com.bohniman.eftapi.model.User;
import com.bohniman.eftapi.repository.UserRepository;
import com.bohniman.eftapi.security.JwtProvider;

/**
 * UniqueIdGenerator
 */
@Component
public class UniqueIdGenerator implements IdentifierGenerator, Configurable {

    public static final String ID_NAME = "id_name";
    public static final String PREFIX = "prefix";
    public static final String RETURN_TYPE = "type";

    private String idName;
    private String prefix;
    private String returnType;
    
    @Autowired
	JwtProvider jwttokenProvider;
    
    @Autowired
    UserRepository userRepository;

    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object obj) throws HibernateException {

        Integer uniqueId = null; 
        
        String userscope = "";
        
        System.out.println("HEY HEY HEY");
        
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        
        userscope = ((UserPrincipal) authentication.getPrincipal()).getUserScope();
        
        
//        User user = userRepository.findByUsername(username);
//        String userScopeCode = user.getUserScope().getScopeCode();
        
        System.out.println("userscope "+userscope);

        try {
            Connection connection = session.connection();
            PreparedStatement ps = null;
        
                ps = connection.prepareStatement("CALL suspectIdGenerator(?)");
                ps.setString(1, userscope);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    uniqueId = rs.getInt("uniqueId");
                }
                System.out.println("Suspect Unique Id : " + uniqueId);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        if (returnType.equalsIgnoreCase("string")) {
            return prefix + userscope + uniqueId;
        } else if (returnType.equalsIgnoreCase("long")) {
            return Long.parseLong(uniqueId + "");
        } else {
            return null;
        }

    }

    @Override
    public void configure(Type type, Properties properties, ServiceRegistry serviceRegistry) throws MappingException {
        idName = ConfigurationHelper.getString(ID_NAME, properties);
        prefix = ConfigurationHelper.getString(PREFIX, properties);
        returnType = ConfigurationHelper.getString(RETURN_TYPE, properties);
    }

}