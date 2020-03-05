package com.bohniman.eftapi.model;

import java.util.Objects;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * UserScope
 */
@Entity
public class UserScope {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Long id;

    private String scopeCode;
    private String scopeName;
    private String roleScope;

    public UserScope() {
    }

    public UserScope(Long id, String scopeCode, String scopeName, String roleScope) {
        this.id = id;
        this.scopeCode = scopeCode;
        this.scopeName = scopeName;
        this.roleScope = roleScope;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getScopeCode() {
        return this.scopeCode;
    }

    public void setScopeCode(String scopeCode) {
        this.scopeCode = scopeCode;
    }

    public String getScopeName() {
        return this.scopeName;
    }

    public void setScopeName(String scopeName) {
        this.scopeName = scopeName;
    }

    public String getRoleScope() {
        return this.roleScope;
    }

    public void setRoleScope(String roleScope) {
        this.roleScope = roleScope;
    }

    public UserScope id(Long id) {
        this.id = id;
        return this;
    }

    public UserScope scopeCode(String scopeCode) {
        this.scopeCode = scopeCode;
        return this;
    }

    public UserScope scopeName(String scopeName) {
        this.scopeName = scopeName;
        return this;
    }

    public UserScope roleScope(String roleScope) {
        this.roleScope = roleScope;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof UserScope)) {
            return false;
        }
        UserScope userScope = (UserScope) o;
        return Objects.equals(id, userScope.id) && Objects.equals(scopeCode, userScope.scopeCode)
                && Objects.equals(scopeName, userScope.scopeName) && Objects.equals(roleScope, userScope.roleScope);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, scopeCode, scopeName, roleScope);
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", scopeCode='" + getScopeCode() + "'" + ", scopeName='" + getScopeName()
                + "'" + ", roleScope='" + getRoleScope() + "'" + "}";
    }

}