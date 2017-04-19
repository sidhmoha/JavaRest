package com.sidhant.sampletutorial.messege.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.sidhant.sampletutorial.messege.database.DatabaseClass;
import com.sidhant.sampletutorial.messege.exception.DataNotFoundException;
import com.sidhant.sampletutorial.messege.model.Message;
import com.sidhant.sampletutorial.messege.model.Profile;

public class ProfileService {

	private Map<String,Profile> profiles= DatabaseClass.getProfiles();
	
	public ProfileService(){
		profiles.put("Koushik", new Profile(1L,"Koushik","Koushik","Mohanty"));
	}
	
	
	 public List<Profile> getAllProfiles()
	 {
		 return new ArrayList<Profile>(profiles.values());
	 }
	
	public Profile getProfile(String profileName){
		return profiles.get(profileName);
	}
	
	public Profile addProfile(Profile profile){
		profile.setId(profiles.size()+1);
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}
	public Profile updateProfile(Profile profile)
	{
		if (profile.getProfileName().isEmpty()){
			return null;
		}
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}
	public Profile removeProfile(String profileName){
		return profiles.remove(profileName);
	}
	
	
}
