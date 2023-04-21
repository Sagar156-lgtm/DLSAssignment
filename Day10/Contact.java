package com.bridgelabz.DLS_Assinment_Program.Day10;

public class Contact {

        private String firstName;
        private String lastName;
        private  String address;
        private String city;
        private String state;
        private long zip;
        private long  number;
        private String emailId;

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {

            this.lastName = lastName;
        }

        public String getAddress() {

            return address;
        }

        public void setAddress(String address) {

            this.address = address;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {

            this.city = city;
        }

        public String getState() {

            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public void setZip(int zip){
            this.zip=zip;
        }

        public long getNumber() {

            return number;
        }

        public void setNumber(long number) {
            this.number = number;
        }

        public String getEmailId() {
            return emailId;
        }

        public long getZip() {
            return zip;
        }

        public void setZip(long zip) {
            this.zip = zip;
        }

        public void setEmailId(String emailId) {
            this.emailId = emailId;
        }

        @Override
        public String
        toString() {
            return "Contact{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", address='" + address + '\'' +
                    ", city='" + city + '\'' +
                    ", state='" + state + '\'' +
                    ", zip=" + zip +
                    ", number=" + number +
                    ", emailId='" + emailId + '\'' +
                    '}';
        }
    }


