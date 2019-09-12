package com.github.lybgeek.spilt.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookDTO {
  private Long id;

  @NotNull(message = "书名不能为空")
  private String bookName;

  @NotNull(message = "作者不能为空")
  private String author;

  private String description;

  @NotNull(message = "价格不能为空")
  private BigDecimal price;

  @NotNull(message = "库存不能为空")
  private Integer stock;

}