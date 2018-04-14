package omy.boston.videoplejer;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        // Dohvatiš VideView
        VideoView videoProplanak = (VideoView) findViewById(R.id.videoView);

        // Postaviš put do video zapisa u raw-u
        videoProplanak.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.video_needforspeed));

        // Postaviš kotrole MediaControllera na VideoView za upravljanje
        videoProplanak.setMediaController(new MediaController(this));

        videoProplanak.requestFocus();
    }
}
