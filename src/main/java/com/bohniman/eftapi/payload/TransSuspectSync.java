package com.bohniman.eftapi.payload;

import java.util.Date;
import java.util.Objects;

/**
 * TransSuspectSync
 */
public class TransSuspectSync {

    private String suspectId;
    // IO/ERO
    private String initiatedBy;
    // Convicted or Illigal Migrant
    private String typeOfSuspect;
    private String firstName;
    private String middleName;
    private String lastName;
    private String fatherName;
    private String motherName;
    private Date dateOfBirth;
    private String placeOfBirth;
    private String age;
    private String ageOnDate;
    

    public TransSuspectSync() {
    }

    public TransSuspectSync(String suspectId, String initiatedBy, String typeOfSuspect, String firstName, String middleName, String lastName, String fatherName, String motherName, Date dateOfBirth, String placeOfBirth, String age, String ageOnDate) {
        this.suspectId = suspectId;
        this.initiatedBy = initiatedBy;
        this.typeOfSuspect = typeOfSuspect;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.dateOfBirth = dateOfBirth;
        this.placeOfBirth = placeOfBirth;
        this.age = age;
        this.ageOnDate = ageOnDate;
    }

    public String getSuspectId() {
        return this.suspectId;
    }

    public void setSuspectId(String suspectId) {
        this.suspectId = suspectId;
    }

    public String getInitiatedBy() {
        return this.initiatedBy;
    }

    public void setInitiatedBy(String initiatedBy) {
        this.initiatedBy = initiatedBy;
    }

    public String getTypeOfSuspect() {
        return this.typeOfSuspect;
    }

    public void setTypeOfSuspect(String typeOfSuspect) {
        this.typeOfSuspect = typeOfSuspect;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFatherName() {
        return this.fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return this.motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public Date getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPlaceOfBirth() {
        return this.placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public String getAge() {
        return this.age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAgeOnDate() {
        return this.ageOnDate;
    }

    public void setAgeOnDate(String ageOnDate) {
        this.ageOnDate = ageOnDate;
    }

    public TransSuspectSync suspectId(String suspectId) {
        this.suspectId = suspectId;
        return this;
    }

    public TransSuspectSync initiatedBy(String initiatedBy) {
        this.initiatedBy = initiatedBy;
        return this;
    }

    public TransSuspectSync typeOfSuspect(String typeOfSuspect) {
        this.typeOfSuspect = typeOfSuspect;
        return this;
    }

    public TransSuspectSync firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public TransSuspectSync middleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    public TransSuspectSync lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public TransSuspectSync fatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    public TransSuspectSync motherName(String motherName) {
        this.motherName = motherName;
        return this;
    }

    public TransSuspectSync dateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public TransSuspectSync placeOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
        return this;
    }

    public TransSuspectSync age(String age) {
        this.age = age;
        return this;
    }

    public TransSuspectSync ageOnDate(String ageOnDate) {
        this.ageOnDate = ageOnDate;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof TransSuspectSync)) {
            return false;
        }
        TransSuspectSync transSuspectSync = (TransSuspectSync) o;
        return Objects.equals(suspectId, transSuspectSync.suspectId) && Objects.equals(initiatedBy, transSuspectSync.initiatedBy) && Objects.equals(typeOfSuspect, transSuspectSync.typeOfSuspect) && Objects.equals(firstName, transSuspectSync.firstName) && Objects.equals(middleName, transSuspectSync.middleName) && Objects.equals(lastName, transSuspectSync.lastName) && Objects.equals(fatherName, transSuspectSync.fatherName) && Objects.equals(motherName, transSuspectSync.motherName) && Objects.equals(dateOfBirth, transSuspectSync.dateOfBirth) && Objects.equals(placeOfBirth, transSuspectSync.placeOfBirth) && Objects.equals(age, transSuspectSync.age) && Objects.equals(ageOnDate, transSuspectSync.ageOnDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(suspectId, initiatedBy, typeOfSuspect, firstName, middleName, lastName, fatherName, motherName, dateOfBirth, placeOfBirth, age, ageOnDate);
    }

    @Override
    public String toString() {
        return "{" +
            " suspectId='" + getSuspectId() + "'" +
            ", initiatedBy='" + getInitiatedBy() + "'" +
            ", typeOfSuspect='" + getTypeOfSuspect() + "'" +
            ", firstName='" + getFirstName() + "'" +
            ", middleName='" + getMiddleName() + "'" +
            ", lastName='" + getLastName() + "'" +
            ", fatherName='" + getFatherName() + "'" +
            ", motherName='" + getMotherName() + "'" +
            ", dateOfBirth='" + getDateOfBirth() + "'" +
            ", placeOfBirth='" + getPlaceOfBirth() + "'" +
            ", age='" + getAge() + "'" +
            ", ageOnDate='" + getAgeOnDate() + "'" +
            "}";
    }

}