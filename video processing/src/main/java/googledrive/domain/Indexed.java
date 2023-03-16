package googledrive.domain;

import googledrive.domain.*;
import googledrive.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Indexed extends AbstractEvent {

    private Long id;
    private Long fileId;
    private Object keywords;
}
