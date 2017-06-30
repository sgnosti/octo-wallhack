
package de.sgnosti.wallhack.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "rateLimitStatus",
    "accessLevel",
    "id",
    "name",
    "email",
    "screenName",
    "location",
    "description",
    "descriptionURLEntities",
    "url",
    "followersCount",
    "status",
    "profileBackgroundColor",
    "profileTextColor",
    "profileLinkColor",
    "profileSidebarFillColor",
    "profileSidebarBorderColor",
    "profileUseBackgroundImage",
    "showAllInlineMedia",
    "friendsCount",
    "createdAt",
    "favouritesCount",
    "utcOffset",
    "timeZone",
    "profileBackgroundImageUrlHttps",
    "profileBackgroundTiled",
    "lang",
    "statusesCount",
    "translator",
    "listedCount",
    "withheldInCountries",
    "protected",
    "contributorsEnabled",
    "profileImageURL",
    "biggerProfileImageURL",
    "miniProfileImageURL",
    "originalProfileImageURL",
    "profileImageURLHttps",
    "biggerProfileImageURLHttps",
    "miniProfileImageURLHttps",
    "originalProfileImageURLHttps",
    "defaultProfileImage",
    "defaultProfile",
    "profileBackgroundImageURL",
    "profileBannerURL",
    "profileBannerRetinaURL",
    "profileBannerIPadURL",
    "profileBannerIPadRetinaURL",
    "profileBannerMobileURL",
    "profileBannerMobileRetinaURL",
    "geoEnabled",
    "verified",
    "followRequestSent",
    "urlentity"
})
public class User_ {

    @JsonProperty("protected")
    private Boolean _protected;
    @JsonProperty("accessLevel")
    private Integer accessLevel;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();
    @JsonProperty("biggerProfileImageURL")
    private String biggerProfileImageURL;
    @JsonProperty("biggerProfileImageURLHttps")
    private String biggerProfileImageURLHttps;
    @JsonProperty("contributorsEnabled")
    private Boolean contributorsEnabled;
    @JsonProperty("createdAt")
    private Integer createdAt;
    @JsonProperty("defaultProfile")
    private Boolean defaultProfile;
    @JsonProperty("defaultProfileImage")
    private Boolean defaultProfileImage;
    @JsonProperty("description")
    private Object description;
    @JsonProperty("descriptionURLEntities")
    private List<Object> descriptionURLEntities = new ArrayList<Object>();
    @JsonProperty("email")
    private Object email;
    @JsonProperty("favouritesCount")
    private Integer favouritesCount;
    @JsonProperty("followersCount")
    private Integer followersCount;
    @JsonProperty("followRequestSent")
    private Boolean followRequestSent;
    @JsonProperty("friendsCount")
    private Integer friendsCount;
    @JsonProperty("geoEnabled")
    private Boolean geoEnabled;
    @JsonProperty("id")
    private Long id;
    @JsonProperty("lang")
    private String lang;
    @JsonProperty("listedCount")
    private Integer listedCount;
    @JsonProperty("location")
    private Object location;
    @JsonProperty("miniProfileImageURL")
    private String miniProfileImageURL;
    @JsonProperty("miniProfileImageURLHttps")
    private String miniProfileImageURLHttps;
    @JsonProperty("name")
    private String name;
    @JsonProperty("originalProfileImageURL")
    private String originalProfileImageURL;
    @JsonProperty("originalProfileImageURLHttps")
    private String originalProfileImageURLHttps;
    @JsonProperty("profileBackgroundColor")
    private String profileBackgroundColor;
    @JsonProperty("profileBackgroundImageURL")
    private String profileBackgroundImageURL;
    @JsonProperty("profileBackgroundImageUrlHttps")
    private String profileBackgroundImageUrlHttps;
    @JsonProperty("profileBackgroundTiled")
    private Boolean profileBackgroundTiled;
    @JsonProperty("profileBannerIPadRetinaURL")
    private String profileBannerIPadRetinaURL;
    @JsonProperty("profileBannerIPadURL")
    private String profileBannerIPadURL;
    @JsonProperty("profileBannerMobileRetinaURL")
    private String profileBannerMobileRetinaURL;
    @JsonProperty("profileBannerMobileURL")
    private String profileBannerMobileURL;
    @JsonProperty("profileBannerRetinaURL")
    private String profileBannerRetinaURL;
    @JsonProperty("profileBannerURL")
    private String profileBannerURL;
    @JsonProperty("profileImageURL")
    private String profileImageURL;
    @JsonProperty("profileImageURLHttps")
    private String profileImageURLHttps;
    @JsonProperty("profileLinkColor")
    private String profileLinkColor;
    @JsonProperty("profileSidebarBorderColor")
    private String profileSidebarBorderColor;
    @JsonProperty("profileSidebarFillColor")
    private String profileSidebarFillColor;
    @JsonProperty("profileTextColor")
    private String profileTextColor;
    @JsonProperty("profileUseBackgroundImage")
    private Boolean profileUseBackgroundImage;
    @JsonProperty("rateLimitStatus")
    private Object rateLimitStatus;
    @JsonProperty("screenName")
    private String screenName;
    @JsonProperty("showAllInlineMedia")
    private Boolean showAllInlineMedia;
    @JsonProperty("status")
    private Object status;
    @JsonProperty("statusesCount")
    private Integer statusesCount;
    @JsonProperty("timeZone")
    private Object timeZone;
    @JsonProperty("translator")
    private Boolean translator;
    @JsonProperty("url")
    private Object url;
    @JsonProperty("urlentity")
	private Urlentity urlentity;
    @JsonProperty("utcOffset")
    private Integer utcOffset;
    @JsonProperty("verified")
    private Boolean verified;
    @JsonProperty("withheldInCountries")
    private Object withheldInCountries;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof User_) == false) {
            return false;
        }
        final User_ rhs = ((User_) other);
        return new EqualsBuilder().append(rateLimitStatus, rhs.rateLimitStatus).append(accessLevel, rhs.accessLevel).append(id, rhs.id).append(name, rhs.name).append(email, rhs.email).append(screenName, rhs.screenName).append(location, rhs.location).append(description, rhs.description).append(descriptionURLEntities, rhs.descriptionURLEntities).append(url, rhs.url).append(followersCount, rhs.followersCount).append(status, rhs.status).append(profileBackgroundColor, rhs.profileBackgroundColor).append(profileTextColor, rhs.profileTextColor).append(profileLinkColor, rhs.profileLinkColor).append(profileSidebarFillColor, rhs.profileSidebarFillColor).append(profileSidebarBorderColor, rhs.profileSidebarBorderColor).append(profileUseBackgroundImage, rhs.profileUseBackgroundImage).append(showAllInlineMedia, rhs.showAllInlineMedia).append(friendsCount, rhs.friendsCount).append(createdAt, rhs.createdAt).append(favouritesCount, rhs.favouritesCount).append(utcOffset, rhs.utcOffset).append(timeZone, rhs.timeZone).append(profileBackgroundImageUrlHttps, rhs.profileBackgroundImageUrlHttps).append(profileBackgroundTiled, rhs.profileBackgroundTiled).append(lang, rhs.lang).append(statusesCount, rhs.statusesCount).append(translator, rhs.translator).append(listedCount, rhs.listedCount).append(withheldInCountries, rhs.withheldInCountries).append(_protected, rhs._protected).append(contributorsEnabled, rhs.contributorsEnabled).append(profileImageURL, rhs.profileImageURL).append(biggerProfileImageURL, rhs.biggerProfileImageURL).append(miniProfileImageURL, rhs.miniProfileImageURL).append(originalProfileImageURL, rhs.originalProfileImageURL).append(profileImageURLHttps, rhs.profileImageURLHttps).append(biggerProfileImageURLHttps, rhs.biggerProfileImageURLHttps).append(miniProfileImageURLHttps, rhs.miniProfileImageURLHttps).append(originalProfileImageURLHttps, rhs.originalProfileImageURLHttps).append(defaultProfileImage, rhs.defaultProfileImage).append(defaultProfile, rhs.defaultProfile).append(profileBackgroundImageURL, rhs.profileBackgroundImageURL).append(profileBannerURL, rhs.profileBannerURL).append(profileBannerRetinaURL, rhs.profileBannerRetinaURL).append(profileBannerIPadURL, rhs.profileBannerIPadURL).append(profileBannerIPadRetinaURL, rhs.profileBannerIPadRetinaURL).append(profileBannerMobileURL, rhs.profileBannerMobileURL).append(profileBannerMobileRetinaURL, rhs.profileBannerMobileRetinaURL).append(geoEnabled, rhs.geoEnabled).append(verified, rhs.verified).append(followRequestSent, rhs.followRequestSent).append(urlentity, rhs.urlentity).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

    @JsonProperty("accessLevel")
    public Integer getAccessLevel() {
        return accessLevel;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonProperty("biggerProfileImageURL")
    public String getBiggerProfileImageURL() {
        return biggerProfileImageURL;
    }

    @JsonProperty("biggerProfileImageURLHttps")
    public String getBiggerProfileImageURLHttps() {
        return biggerProfileImageURLHttps;
    }

    @JsonProperty("contributorsEnabled")
    public Boolean getContributorsEnabled() {
        return contributorsEnabled;
    }

    @JsonProperty("createdAt")
    public Integer getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("defaultProfile")
    public Boolean getDefaultProfile() {
        return defaultProfile;
    }

    @JsonProperty("defaultProfileImage")
    public Boolean getDefaultProfileImage() {
        return defaultProfileImage;
    }

    @JsonProperty("description")
    public Object getDescription() {
        return description;
    }

    @JsonProperty("descriptionURLEntities")
    public List<Object> getDescriptionURLEntities() {
        return descriptionURLEntities;
    }

    @JsonProperty("email")
    public Object getEmail() {
        return email;
    }

    @JsonProperty("favouritesCount")
    public Integer getFavouritesCount() {
        return favouritesCount;
    }

    @JsonProperty("followersCount")
    public Integer getFollowersCount() {
        return followersCount;
    }

    @JsonProperty("followRequestSent")
    public Boolean getFollowRequestSent() {
        return followRequestSent;
    }

    @JsonProperty("friendsCount")
    public Integer getFriendsCount() {
        return friendsCount;
    }

    @JsonProperty("geoEnabled")
    public Boolean getGeoEnabled() {
        return geoEnabled;
    }

    @JsonProperty("id")
	public Long getId() {
        return id;
    }

    @JsonProperty("lang")
    public String getLang() {
        return lang;
    }

    @JsonProperty("listedCount")
    public Integer getListedCount() {
        return listedCount;
    }

    @JsonProperty("location")
    public Object getLocation() {
        return location;
    }

    @JsonProperty("miniProfileImageURL")
    public String getMiniProfileImageURL() {
        return miniProfileImageURL;
    }

    @JsonProperty("miniProfileImageURLHttps")
    public String getMiniProfileImageURLHttps() {
        return miniProfileImageURLHttps;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("originalProfileImageURL")
    public String getOriginalProfileImageURL() {
        return originalProfileImageURL;
    }

    @JsonProperty("originalProfileImageURLHttps")
    public String getOriginalProfileImageURLHttps() {
        return originalProfileImageURLHttps;
    }

    @JsonProperty("profileBackgroundColor")
    public String getProfileBackgroundColor() {
        return profileBackgroundColor;
    }

    @JsonProperty("profileBackgroundImageURL")
    public String getProfileBackgroundImageURL() {
        return profileBackgroundImageURL;
    }

    @JsonProperty("profileBackgroundImageUrlHttps")
    public String getProfileBackgroundImageUrlHttps() {
        return profileBackgroundImageUrlHttps;
    }

    @JsonProperty("profileBackgroundTiled")
    public Boolean getProfileBackgroundTiled() {
        return profileBackgroundTiled;
    }

    @JsonProperty("profileBannerIPadRetinaURL")
    public String getProfileBannerIPadRetinaURL() {
        return profileBannerIPadRetinaURL;
    }

    @JsonProperty("profileBannerIPadURL")
    public String getProfileBannerIPadURL() {
        return profileBannerIPadURL;
    }

    @JsonProperty("profileBannerMobileRetinaURL")
    public String getProfileBannerMobileRetinaURL() {
        return profileBannerMobileRetinaURL;
    }

    @JsonProperty("profileBannerMobileURL")
    public String getProfileBannerMobileURL() {
        return profileBannerMobileURL;
    }

    @JsonProperty("profileBannerRetinaURL")
    public String getProfileBannerRetinaURL() {
        return profileBannerRetinaURL;
    }

    @JsonProperty("profileBannerURL")
    public String getProfileBannerURL() {
        return profileBannerURL;
    }

    @JsonProperty("profileImageURL")
    public String getProfileImageURL() {
        return profileImageURL;
    }

    @JsonProperty("profileImageURLHttps")
    public String getProfileImageURLHttps() {
        return profileImageURLHttps;
    }

    @JsonProperty("profileLinkColor")
    public String getProfileLinkColor() {
        return profileLinkColor;
    }

    @JsonProperty("profileSidebarBorderColor")
    public String getProfileSidebarBorderColor() {
        return profileSidebarBorderColor;
    }

    @JsonProperty("profileSidebarFillColor")
    public String getProfileSidebarFillColor() {
        return profileSidebarFillColor;
    }

    @JsonProperty("profileTextColor")
    public String getProfileTextColor() {
        return profileTextColor;
    }

    @JsonProperty("profileUseBackgroundImage")
    public Boolean getProfileUseBackgroundImage() {
        return profileUseBackgroundImage;
    }

    @JsonProperty("protected")
    public Boolean getProtected() {
        return _protected;
    }

    @JsonProperty("rateLimitStatus")
    public Object getRateLimitStatus() {
        return rateLimitStatus;
    }

    @JsonProperty("screenName")
    public String getScreenName() {
        return screenName;
    }

    @JsonProperty("showAllInlineMedia")
    public Boolean getShowAllInlineMedia() {
        return showAllInlineMedia;
    }

    @JsonProperty("status")
    public Object getStatus() {
        return status;
    }

    @JsonProperty("statusesCount")
    public Integer getStatusesCount() {
        return statusesCount;
    }

    @JsonProperty("timeZone")
    public Object getTimeZone() {
        return timeZone;
    }

    @JsonProperty("translator")
    public Boolean getTranslator() {
        return translator;
    }

    @JsonProperty("url")
    public Object getUrl() {
        return url;
    }

    @JsonProperty("urlentity")
	public Urlentity getUrlentity() {
        return urlentity;
    }

    @JsonProperty("utcOffset")
    public Integer getUtcOffset() {
        return utcOffset;
    }

    @JsonProperty("verified")
    public Boolean getVerified() {
        return verified;
    }

    @JsonProperty("withheldInCountries")
    public Object getWithheldInCountries() {
        return withheldInCountries;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(rateLimitStatus).append(accessLevel).append(id).append(name).append(email).append(screenName).append(location).append(description).append(descriptionURLEntities).append(url).append(followersCount).append(status).append(profileBackgroundColor).append(profileTextColor).append(profileLinkColor).append(profileSidebarFillColor).append(profileSidebarBorderColor).append(profileUseBackgroundImage).append(showAllInlineMedia).append(friendsCount).append(createdAt).append(favouritesCount).append(utcOffset).append(timeZone).append(profileBackgroundImageUrlHttps).append(profileBackgroundTiled).append(lang).append(statusesCount).append(translator).append(listedCount).append(withheldInCountries).append(_protected).append(contributorsEnabled).append(profileImageURL).append(biggerProfileImageURL).append(miniProfileImageURL).append(originalProfileImageURL).append(profileImageURLHttps).append(biggerProfileImageURLHttps).append(miniProfileImageURLHttps).append(originalProfileImageURLHttps).append(defaultProfileImage).append(defaultProfile).append(profileBackgroundImageURL).append(profileBannerURL).append(profileBannerRetinaURL).append(profileBannerIPadURL).append(profileBannerIPadRetinaURL).append(profileBannerMobileURL).append(profileBannerMobileRetinaURL).append(geoEnabled).append(verified).append(followRequestSent).append(urlentity).append(additionalProperties).toHashCode();
    }

    @JsonProperty("accessLevel")
    public void setAccessLevel(Integer accessLevel) {
        this.accessLevel = accessLevel;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @JsonProperty("biggerProfileImageURL")
    public void setBiggerProfileImageURL(String biggerProfileImageURL) {
        this.biggerProfileImageURL = biggerProfileImageURL;
    }

    @JsonProperty("biggerProfileImageURLHttps")
    public void setBiggerProfileImageURLHttps(String biggerProfileImageURLHttps) {
        this.biggerProfileImageURLHttps = biggerProfileImageURLHttps;
    }

    @JsonProperty("contributorsEnabled")
    public void setContributorsEnabled(Boolean contributorsEnabled) {
        this.contributorsEnabled = contributorsEnabled;
    }

    @JsonProperty("createdAt")
    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("defaultProfile")
    public void setDefaultProfile(Boolean defaultProfile) {
        this.defaultProfile = defaultProfile;
    }

    @JsonProperty("defaultProfileImage")
    public void setDefaultProfileImage(Boolean defaultProfileImage) {
        this.defaultProfileImage = defaultProfileImage;
    }

    @JsonProperty("description")
    public void setDescription(Object description) {
        this.description = description;
    }

    @JsonProperty("descriptionURLEntities")
    public void setDescriptionURLEntities(List<Object> descriptionURLEntities) {
        this.descriptionURLEntities = descriptionURLEntities;
    }

    @JsonProperty("email")
    public void setEmail(Object email) {
        this.email = email;
    }

    @JsonProperty("favouritesCount")
    public void setFavouritesCount(Integer favouritesCount) {
        this.favouritesCount = favouritesCount;
    }

    @JsonProperty("followersCount")
    public void setFollowersCount(Integer followersCount) {
        this.followersCount = followersCount;
    }

    @JsonProperty("followRequestSent")
    public void setFollowRequestSent(Boolean followRequestSent) {
        this.followRequestSent = followRequestSent;
    }

    @JsonProperty("friendsCount")
    public void setFriendsCount(Integer friendsCount) {
        this.friendsCount = friendsCount;
    }

    @JsonProperty("geoEnabled")
    public void setGeoEnabled(Boolean geoEnabled) {
        this.geoEnabled = geoEnabled;
    }

    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }

    @JsonProperty("lang")
    public void setLang(String lang) {
        this.lang = lang;
    }

    @JsonProperty("listedCount")
    public void setListedCount(Integer listedCount) {
        this.listedCount = listedCount;
    }

    @JsonProperty("location")
    public void setLocation(Object location) {
        this.location = location;
    }

    @JsonProperty("miniProfileImageURL")
    public void setMiniProfileImageURL(String miniProfileImageURL) {
        this.miniProfileImageURL = miniProfileImageURL;
    }

    @JsonProperty("miniProfileImageURLHttps")
    public void setMiniProfileImageURLHttps(String miniProfileImageURLHttps) {
        this.miniProfileImageURLHttps = miniProfileImageURLHttps;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("originalProfileImageURL")
    public void setOriginalProfileImageURL(String originalProfileImageURL) {
        this.originalProfileImageURL = originalProfileImageURL;
    }

    @JsonProperty("originalProfileImageURLHttps")
    public void setOriginalProfileImageURLHttps(String originalProfileImageURLHttps) {
        this.originalProfileImageURLHttps = originalProfileImageURLHttps;
    }

    @JsonProperty("profileBackgroundColor")
    public void setProfileBackgroundColor(String profileBackgroundColor) {
        this.profileBackgroundColor = profileBackgroundColor;
    }

    @JsonProperty("profileBackgroundImageURL")
    public void setProfileBackgroundImageURL(String profileBackgroundImageURL) {
        this.profileBackgroundImageURL = profileBackgroundImageURL;
    }

    @JsonProperty("profileBackgroundImageUrlHttps")
    public void setProfileBackgroundImageUrlHttps(String profileBackgroundImageUrlHttps) {
        this.profileBackgroundImageUrlHttps = profileBackgroundImageUrlHttps;
    }

    @JsonProperty("profileBackgroundTiled")
    public void setProfileBackgroundTiled(Boolean profileBackgroundTiled) {
        this.profileBackgroundTiled = profileBackgroundTiled;
    }

    @JsonProperty("profileBannerIPadRetinaURL")
    public void setProfileBannerIPadRetinaURL(String profileBannerIPadRetinaURL) {
        this.profileBannerIPadRetinaURL = profileBannerIPadRetinaURL;
    }

    @JsonProperty("profileBannerIPadURL")
    public void setProfileBannerIPadURL(String profileBannerIPadURL) {
        this.profileBannerIPadURL = profileBannerIPadURL;
    }

    @JsonProperty("profileBannerMobileRetinaURL")
    public void setProfileBannerMobileRetinaURL(String profileBannerMobileRetinaURL) {
        this.profileBannerMobileRetinaURL = profileBannerMobileRetinaURL;
    }

    @JsonProperty("profileBannerMobileURL")
    public void setProfileBannerMobileURL(String profileBannerMobileURL) {
        this.profileBannerMobileURL = profileBannerMobileURL;
    }

    @JsonProperty("profileBannerRetinaURL")
    public void setProfileBannerRetinaURL(String profileBannerRetinaURL) {
        this.profileBannerRetinaURL = profileBannerRetinaURL;
    }

    @JsonProperty("profileBannerURL")
    public void setProfileBannerURL(String profileBannerURL) {
        this.profileBannerURL = profileBannerURL;
    }

    @JsonProperty("profileImageURL")
    public void setProfileImageURL(String profileImageURL) {
        this.profileImageURL = profileImageURL;
    }

    @JsonProperty("profileImageURLHttps")
    public void setProfileImageURLHttps(String profileImageURLHttps) {
        this.profileImageURLHttps = profileImageURLHttps;
    }

    @JsonProperty("profileLinkColor")
    public void setProfileLinkColor(String profileLinkColor) {
        this.profileLinkColor = profileLinkColor;
    }

    @JsonProperty("profileSidebarBorderColor")
    public void setProfileSidebarBorderColor(String profileSidebarBorderColor) {
        this.profileSidebarBorderColor = profileSidebarBorderColor;
    }

    @JsonProperty("profileSidebarFillColor")
    public void setProfileSidebarFillColor(String profileSidebarFillColor) {
        this.profileSidebarFillColor = profileSidebarFillColor;
    }

    @JsonProperty("profileTextColor")
    public void setProfileTextColor(String profileTextColor) {
        this.profileTextColor = profileTextColor;
    }

    @JsonProperty("profileUseBackgroundImage")
    public void setProfileUseBackgroundImage(Boolean profileUseBackgroundImage) {
        this.profileUseBackgroundImage = profileUseBackgroundImage;
    }

    @JsonProperty("protected")
    public void setProtected(Boolean _protected) {
        this._protected = _protected;
    }

    @JsonProperty("rateLimitStatus")
    public void setRateLimitStatus(Object rateLimitStatus) {
        this.rateLimitStatus = rateLimitStatus;
    }

    @JsonProperty("screenName")
    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    @JsonProperty("showAllInlineMedia")
    public void setShowAllInlineMedia(Boolean showAllInlineMedia) {
        this.showAllInlineMedia = showAllInlineMedia;
    }

    @JsonProperty("status")
    public void setStatus(Object status) {
        this.status = status;
    }

    @JsonProperty("statusesCount")
    public void setStatusesCount(Integer statusesCount) {
        this.statusesCount = statusesCount;
    }

    @JsonProperty("timeZone")
    public void setTimeZone(Object timeZone) {
        this.timeZone = timeZone;
    }

    @JsonProperty("translator")
    public void setTranslator(Boolean translator) {
        this.translator = translator;
    }

    @JsonProperty("url")
    public void setUrl(Object url) {
        this.url = url;
    }

    @JsonProperty("urlentity")
	public void setUrlentity(Urlentity urlentity) {
        this.urlentity = urlentity;
    }

    @JsonProperty("utcOffset")
    public void setUtcOffset(Integer utcOffset) {
        this.utcOffset = utcOffset;
    }

    @JsonProperty("verified")
    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    @JsonProperty("withheldInCountries")
    public void setWithheldInCountries(Object withheldInCountries) {
        this.withheldInCountries = withheldInCountries;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
