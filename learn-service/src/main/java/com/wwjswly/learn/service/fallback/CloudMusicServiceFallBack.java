package com.wwjswly.learn.service.fallback;

import com.wwjswly.learn.api.base.ResponseEntity;
import com.wwjswly.learn.service.CloudMusicServiceClient;
import com.wwjswly.neteasecloudmusic.request.LoginEmailRequest;

public class CloudMusicServiceFallBack implements CloudMusicServiceClient {

    @Override
    public ResponseEntity search(String keyworld) {
        return null;
    }

    @Override
    public ResponseEntity loginByEmail(LoginEmailRequest request) {
        return null;
    }
}
