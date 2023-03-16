package untitled.domain;

import java.util.*;
import lombok.Data;
import untitled.infra.AbstractEvent;

@Data
public class FileUpoaded extends AbstractEvent {

    private Long id;
    private String name;
    private Long size;
    private String type;
    private String userid;
}
