package data.entity;

import lombok.Data;
import javax.persistence.*;
import java.sql.Timestamp;

/**
 * @author zyw
 * @date 2020/8/22 11:07
 */
@Data
@Entity
public class Video {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "char(64)")
    private String digest;

    private Integer size;

    private String name;

    private String tag;

    private String star;

    private Timestamp createdAt;
}
