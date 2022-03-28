package task;

import lombok.*;

@Builder //@Builder generates an @AllArgsConstructor unless there is another @XConstructor
@Data //is shortcut of @Getter, @Setter, @ToString and require constructor.
public class Orange {
    private int weight;
    private Color color;
}
