package community.gdsc.wanted.DTO;

import community.gdsc.wanted.domain.Found;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ModifyRequestDto {
    private String title;

    private String content;

    private Integer is_deleted = 0;

    public Found toEntity() {
        return Found.builder()
            .title(title)
            .content(content)
            .is_deleted(is_deleted)
            .build();
    }
}
