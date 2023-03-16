package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class Indexed extends AbstractEvent {

    private Long id;
    private Long fileId;
    private List<String> keywords;

    public Indexed(Index aggregate) {
        super(aggregate);
    }

    public Indexed() {
        super();
    }
}
