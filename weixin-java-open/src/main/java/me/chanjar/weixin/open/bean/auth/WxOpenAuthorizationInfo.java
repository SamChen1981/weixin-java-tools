package me.chanjar.weixin.open.bean.auth;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author <a href="https://github.com/007gzs">007</a>
 */
@Data
public class WxOpenAuthorizationInfo implements Serializable {
  private static final long serialVersionUID = -8713680081354754208L;

  private String authorizerAppid;
  private String authorizerAccessToken;
  private int expiresIn;
  private String authorizerRefreshToken;
  private List<Integer> funcInfo;

  public String getAuthorizerAppid() {
    return authorizerAppid;
  }

  public void setAuthorizerAppid(String authorizerAppid) {
    this.authorizerAppid = authorizerAppid;
  }

  public String getAuthorizerAccessToken() {
    return authorizerAccessToken;
  }

  public void setAuthorizerAccessToken(String authorizerAccessToken) {
    this.authorizerAccessToken = authorizerAccessToken;
  }

  public int getExpiresIn() {
    return expiresIn;
  }

  public void setExpiresIn(int expiresIn) {
    this.expiresIn = expiresIn;
  }

  public String getAuthorizerRefreshToken() {
    return authorizerRefreshToken;
  }

  public void setAuthorizerRefreshToken(String authorizerRefreshToken) {
    this.authorizerRefreshToken = authorizerRefreshToken;
  }

  public List<Integer> getFuncInfo() {
    return funcInfo;
  }

  public void setFuncInfo(List<Integer> funcInfo) {
    this.funcInfo = funcInfo;
  }
}
