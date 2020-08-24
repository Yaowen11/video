package controller;

import data.entity.Video;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import service.VideoService;

import java.util.Random;

@Log
@RestController
public class VideoController {

    private final VideoService videoService;

    @Autowired
    public VideoController(VideoService videoService) {
        this.videoService = videoService;
    }

    @GetMapping("/videos/{page}")
    public Page<Video> index(@PathVariable Integer page) {
        log.info("integer: " + page);
        return videoService.page(page == null ? 1 : page);
    }

    @GetMapping("/show/{str}")
    public String show(@PathVariable String str) {
        return new Random().nextInt() + str;
    }
}
