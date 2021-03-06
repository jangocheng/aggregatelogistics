package net.kdks.config;

/**
 * 圆通快递配置.
 * 
 * <p>API配置,包含[partnerId,secretKey,userId],isProduct标识测试与生产环境<br>
 * 配置获取:<em><a href="http://open.yto.net.cn/">圆通开放平台</a></em>
 * 
 * @author Ze.Wang
 * @since 0.0.1
 */
public class YuantongConfig {
	
	private YuantongConfig(Builder builder) {
		appkey = builder.appkey;
		secretKey = builder.secretKey;
		userId = builder.userId;
		isProduct = builder.isProduct;
    }
	
	private String appkey;
	
	private String secretKey;
	
	private String userId;
	
	private int isProduct;
	
	public String getAppkey() {
		return appkey;
	}

	public void setAppkey(String appkey) {
		this.appkey = appkey;
	}

	public String getSecretKey() {
		return secretKey;
	}

	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getIsProduct() {
		return isProduct;
	}

	public void setIsProduct(int isProduct) {
		this.isProduct = isProduct;
	}

	
	
	public YuantongConfig() {
		super();
	}

	public YuantongConfig(String appkey, String secretKey, String userId) {
		super();
		this.appkey = appkey;
		this.secretKey = secretKey;
		this.userId = userId;
	}

	public YuantongConfig(String appkey, String secretKey, String userId, int isProduct) {
		super();
		this.appkey = appkey;
		this.secretKey = secretKey;
		this.userId = userId;
		this.isProduct = isProduct;
	}

	public static Builder builder() {
        return new Builder();
    }
	
	public static class Builder {
		private String appkey;
		private String secretKey;
		private String userId;
		private int isProduct = 1;
        public Builder appkey(String appkey) {
            this.appkey = appkey;
            return this;
        }

        public Builder secretKey(String secretKey) {
            this.secretKey = secretKey;
            return this;
        }
        
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }
        
        public Builder isProduct(int isProduct) {
            this.isProduct = isProduct;
            return this;
        }

        public YuantongConfig build() {
            return new YuantongConfig(this);
        }
    }

	@Override
	public String toString() {
		return "YuantongConfig [appkey=" + appkey + ", secretKey=" + secretKey + ", userId=" + userId + ", isProduct="
				+ isProduct + "]";
	}

	
	
}
