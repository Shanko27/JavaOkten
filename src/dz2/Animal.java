package dz2;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@ToString
@Getter
public class Animal {
  private   String food;
  private  String location;

  public String makeNoise(){
return "say";
  }
  public String eat(){
    return "омномномном";
  }
  public String sleep(){
    return "sleep";
  }
}
