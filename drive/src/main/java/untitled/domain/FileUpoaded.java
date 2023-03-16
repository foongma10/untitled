package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class FileUpoaded extends AbstractEvent {

    private Long id;
    private String name;
    private Long size;
    private String type;
    private String userid;

    public FileUpoaded(File aggregate) {
        super(aggregate);
    }

    public FileUpoaded() {
        super();
    }
}
