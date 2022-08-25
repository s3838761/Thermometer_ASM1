package main.java.controller;

import main.java.model.Thermometer;

public class TheThermometer implements Thermometer {
	 @Override
	    public String adult(double temp) {
		 
	        if(temp <= 95){
	            return "Hypothermia \nSEEK CARE";
	        }

	        if (95 < temp && temp < 97){
	            return "Low but possibly normal";
	        }
	        if (97 <= temp && temp < 98.6){
	            return "Normal";
	        }
	        if (98.6 <= temp && temp < 100.4){
	            return "Normal or low grade fever";
	        }
	        if (100.4 <= temp && temp < 103){
	            return "Fever";
	        }
	        if (103 <= temp){
	            return "High fever \nCALL YOUR DOCTOR";
	        }
	        return "NV";
	    }

	    @Override
	    public String children(double temp) {
	        if(temp <= 95){
	            return "Hypothermia \nSEEK CARE";
	        }

	        if (95 < temp && temp < 97){
	            return "Low but possibly normal";
	        }
	        if (97 <= temp && temp < 98.6){
	            return "Normal";
	        }
	        if (98.6 <= temp && temp < 100.4){
	            return "Normal or low grade fever";
	        }
	        if (100.4 <= temp && temp < 103){
	            return "Fever";
	        }
	        if (103 <= temp){
	            return "High fever \nCALL YOUR DOCTOR";
	        }
	        return "NV";
	    }

	    @Override
	    public String babies(double temp) {
	        if(temp <= 95){
	            return "Hypothermia \nSEEK CARE";
	        }

	        if (95 < temp && temp < 97){
	            return "Low but possibly normal";
	        }
	        if (97 <= temp && temp < 98.6){
	            return "Normal";
	        }
	        if (98.6 <= temp && temp < 100.4){
	            return "low grade fever";
	        }
	        if (100.4 <= temp && temp < 103){
	            return "Fever \n SEEK CARE";
	        }
	        if (103 <= temp){
	            return "High fever \nCALL YOUR DOCTOR";
	        }
	        return "NV";
	    }
}
