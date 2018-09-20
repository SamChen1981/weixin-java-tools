package me.chanjar.weixin.open.bean.result;

import lombok.Data;
import me.chanjar.weixin.open.bean.auth.WxOpenAuthorizationInfo;
import me.chanjar.weixin.open.bean.auth.WxOpenAuthorizerInfo;

import java.io.Serializable;

/**
 * @author <a href="https://github.com/007gzs">007</a>
 */
@Data
public class WxOpenAuthorizerInfoResult implements Serializable {
  private static final long serialVersionUID = 3166298050833019785L;

  private WxOpenAuthorizationInfo authorizationInfo;
  private WxOpenAuthorizerInfo authorizerInfo;

  public WxOpenAuthorizationInfo getAuthorizationInfo() {
    return authorizationInfo;
  }

  public void setAuthorizationInfo(WxOpenAuthorizationInfo authorizationInfo) {
    this.authorizationInfo = authorizationInfo;
  }

  public WxOpenAuthorizerInfo getAuthorizerInfo() {
    return authorizerInfo;
  }

  public void setAuthorizerInfo(WxOpenAuthorizerInfo authorizerInfo) {
    this.authorizerInfo = authorizerInfo;
  }

  public boolean isMiniProgram() {
    return authorizerInfo != null && authorizerInfo.getMiniProgramInfo() != null;
  }
}
