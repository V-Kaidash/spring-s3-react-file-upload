package com.amigoscode.awsimageupload.profile;

import com.amazonaws.services.s3.AmazonS3;
import com.amigoscode.awsimageupload.datastore.FakeUserProfileDatastore;
import com.amigoscode.awsimageupload.filestore.FileStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

@Repository
public class UserProfileDataAccessService {

    private final FakeUserProfileDatastore fakeUserProfileDatastore;

    @Autowired
    public UserProfileDataAccessService(FakeUserProfileDatastore fakeUserProfileDatastore, FileStore s3) {
        this.fakeUserProfileDatastore = fakeUserProfileDatastore;
    }

    List<UserProfile> getUserProfiles(){
        return fakeUserProfileDatastore.getUserProfiles();
    }

}
