package com.demo.citiespath.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * The Class CitiesPathConfiguration.
 */
@Component
@ConfigurationProperties("citiesPathConfiguration") // prefix citiesPathConfiguration, find citiesPathConfiguration.*
public class CitiesPathConfiguration {

	/** The strategy. */
	private String strategy;

	/** The cities service url. */
	private String citiesServiceUrl;

	/**
	 * The Class CitiesServiceConfig.
	 */
	public static class CitiesServiceConfig {

		/** The url. */
		private String url;

		/*
		 * (non-Javadoc)
		 * 
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "CitiesService{" + "url='" + url + '}';
		}

		/**
		 * Gets the url.
		 *
		 * @return the url
		 */
		public String getUrl() {
			return url;
		}

		/**
		 * Sets the url.
		 *
		 * @param url
		 *            the new url
		 */
		public void setUrl(String url) {
			this.url = url;
		}
	}

	// getters and setters

	/**
	 * Gets the strategy.
	 *
	 * @return the strategy
	 */
	public String getStrategy() {
		return strategy;
	}

	/**
	 * Sets the strategy.
	 *
	 * @param strategy
	 *            the new strategy
	 */
	public void setStrategy(String strategy) {
		this.strategy = strategy;
	}

	/**
	 * Gets the cities service url.
	 *
	 * @return the cities service url
	 */
	public String getCitiesServiceUrl() {
		return citiesServiceUrl;
	}

	/**
	 * Sets the cities service url.
	 *
	 * @param citiesServiceUrl
	 *            the new cities service url
	 */
	public void setCitiesServiceUrl(String citiesServiceUrl) {
		this.citiesServiceUrl = citiesServiceUrl;
	}

}
