package com.spartaglobal.fixerio;

import java.util.Map;

public class FixerioDTO {


        private boolean success;
        private int timestamp;
        private String base;
        private String date;
        private Map<String, Double> rates;

        public boolean isSuccess() {
            return success;
        }

        public void setSuccess(boolean success) {
            this.success = success;
        }

        public int getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(int timestamp) {
            this.timestamp = timestamp;
        }

        public String getBase() {
            return base;
        }

        public void setBase(String base) {
            this.base = base;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public Map<String, Double> getRates() {
            return rates;
        }

        public void setRates(Map<String, Double> rates) {
            this.rates = rates;
        }
    }

