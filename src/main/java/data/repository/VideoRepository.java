package data.repository;

import data.entity.Video;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author zyw
 * @date 2020/8/22 11:07
 */
public interface VideoRepository extends JpaRepository<Video, Integer> {
}
