package me.chanjar.weixin.open.bean.auth;

import lombok.Data;
import org.apache.commons.lang3.tuple.Pair;

import java.util.List;
import java.util.Map;

@Data
public class WxOpenMiniProgramInfo {
  private Map<String, List<String>> network;
  private List<Pair<String, String>> categories;
  private Integer visitStatus;

  public Map<String, List<String>> getNetwork() {
    return network;
  }

  public void setNetwork(Map<String, List<String>> network) {
    this.network = network;
  }

  public List<Pair<String, String>> getCategories() {
    return categories;
  }

  public void setCategories(List<Pair<String, String>> categories) {
    this.categories = categories;
  }

  public Integer getVisitStatus() {
    return visitStatus;
  }

  public void setVisitStatus(Integer visitStatus) {
    this.visitStatus = visitStatus;
  }
}
