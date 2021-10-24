package com.amigoscode.awsimageupload.datastore;

import com.amigoscode.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class FakeUserProfileDatastore {
    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("e21ae757-d059-48e2-bd0b-6e9202e399f7"), "janetjones", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("8b6d7ca7-705a-4eb1-9d59-fd0201543681"), "antoniojunior", null));
    }

    public List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }

}
