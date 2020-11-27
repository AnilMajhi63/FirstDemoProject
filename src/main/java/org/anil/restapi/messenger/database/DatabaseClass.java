package org.anil.restapi.messenger.database;

import java.util.HashMap;
import java.util.Map;

import org.anil.restapi.messenger.model.Message;
import org.anil.restapi.messenger.model.Profile;

public class DatabaseClass {

	static Map<Long, Message> message = new HashMap<Long, Message>();
	static Map<Long, Profile> profile = new HashMap<Long, Profile>();

	public static Map<Long, Message> getMessage() {
		return message;
	}

	public static Map<Long, Profile> getProfile() {
		return profile;
	}
}
