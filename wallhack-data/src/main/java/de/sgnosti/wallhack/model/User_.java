
package de.sgnosti.wallhack.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

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

    @JsonProperty("rateLimitStatus")
    private Object rateLimitStatus;
    @JsonProperty("accessLevel")
    private Integer accessLevel;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("email")
    private Object email;
    @JsonProperty("screenName")
    private String screenName;
    @JsonProperty("location")
    private Object location;
    @JsonProperty("description")
    private Object description;
    @JsonProperty("descriptionURLEntities")
    private List<Object> descriptionURLEntities = new ArrayList<Object>();
    @JsonProperty("url")
    private Object url;
    @JsonProperty("followersCount")
    private Integer followersCount;
    @JsonProperty("status")
    private Object status;
    @JsonProperty("profileBackgroundColor")
    private String profileBackgroundColor;
    @JsonProperty("profileTextColor")
    private String profileTextColor;
    @JsonProperty("profileLinkColor")
    private String profileLinkColor;
    @JsonProperty("profileSidebarFillColor")
    private String profileSidebarFillColor;
    @JsonProperty("profileSidebarBorderColor")
    private String profileSidebarBorderColor;
    @JsonProperty("profileUseBackgroundImage")
    private Boolean profileUseBackgroundImage;
    @JsonProperty("showAllInlineMedia")
    private Boolean showAllInlineMedia;
    @JsonProperty("friendsCount")
    private Integer friendsCount;
    @JsonProperty("createdAt")
    private Integer createdAt;
    @JsonProperty("favouritesCount")
    private Integer favouritesCount;
    @JsonProperty("utcOffset")
    private Integer utcOffset;
    @JsonProperty("timeZone")
    private Object timeZone;
    @JsonProperty("profileBackgroundImageUrlHttps")
    private String profileBackgroundImageUrlHttps;
    @JsonProperty("profileBackgroundTiled")
    private Boolean profileBackgroundTiled;
    @JsonProperty("lang")
    private String lang;
    @JsonProperty("statusesCount")
    private Integer statusesCount;
    @JsonProperty("translator")
    private Boolean translator;
    @JsonProperty("listedCount")
    private Integer listedCount;
    @JsonProperty("withheldInCountries")
    private Object withheldInCountries;
    @JsonProperty("protected")
    private Boolean _protected;
    @JsonProperty("contributorsEnabled")
    private Boolean contributorsEnabled;
    @JsonProperty("profileImageURL")
    private String profileImageURL;
    @JsonProperty("biggerProfileImageURL")
    private String biggerProfileImageURL;
    @JsonProperty("miniProfileImageURL")
    private String miniProfileImageURL;
    @JsonProperty("originalProfileImageURL")
    private String originalProfileImageURL;
    @JsonProperty("profileImageURLHttps")
    private String profileImageURLHttps;
    @JsonProperty("biggerProfileImageURLHttps")
    private String biggerProfileImageURLHttps;
    @JsonProperty("miniProfileImageURLHttps")
    private String miniProfileImageURLHttps;
    @JsonProperty("originalProfileImageURLHttps")
    private String originalProfileImageURLHttps;
    @JsonProperty("defaultProfileImage")
    private Boolean defaultProfileImage;
    @JsonProperty("defaultProfile")
    private Boolean defaultProfile;
    @JsonProperty("profileBackgroundImageURL")
    private String profileBackgroundImageURL;
    @JsonProperty("profileBannerURL")
    private String profileBannerURL;
    @JsonProperty("profileBannerRetinaURL")
    private String profileBannerRetinaURL;
    @JsonProperty("profileBannerIPadURL")
    private String profileBannerIPadURL;
    @JsonProperty("profileBannerIPadRetinaURL")
    private String profileBannerIPadRetinaURL;
    @JsonProperty("profileBannerMobileURL")
    private String profileBannerMobileURL;
    @JsonProperty("profileBannerMobileRetinaURL")
    private String profileBannerMobileRetinaURL;
    @JsonProperty("geoEnabled")
    private Boolean geoEnabled;
    @JsonProperty("verified")
    private Boolean verified;
    @JsonProperty("followRequestSent")
    private Boolean followRequestSent;
    @JsonProperty("urlentity")
    private Urlentity_ urlentity;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("rateLimitStatus")
    public Object getRateLimitStatus() {
        return rateLimitStatus;
    }

    @JsonProperty("rateLimitStatus")
    public void setRateLimitStatus(Object rateLimitStatus) {
        this.rateLimitStatus = rateLimitStatus;
    }

    @JsonProperty("accessLevel")
    public Integer getAccessLevel() {
        return accessLevel;
    }

    @JsonProperty("accessLevel")
    public void setAccessLevel(Integer accessLevel) {
        this.accessLevel = accessLevel;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("email")
    public Object getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(Object email) {
        this.email = email;
    }

    @JsonProperty("screenName")
    public String getScreenName() {
        return screenName;
    }

    @JsonProperty("screenName")
    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    @JsonProperty("location")
    public Object getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(Object location) {
        this.location = location;
    }

    @JsonProperty("description")
    public Object getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(Object description) {
        this.description = description;
    }

    @JsonProperty("descriptionURLEntities")
    public List<Object> getDescriptionURLEntities() {
        return descriptionURLEntities;
    }

    @JsonProperty("descriptionURLEntities")
    public void setDescriptionURLEntities(List<Object> descriptionURLEntities) {
        this.descriptionURLEntities = descriptionURLEntities;
    }

    @JsonProperty("url")
    public Object getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(Object url) {
        this.url = url;
    }

    @JsonProperty("followersCount")
    public Integer getFollowersCount() {
        return followersCount;
    }

    @JsonProperty("followersCount")
    public void setFollowersCount(Integer followersCount) {
        this.followersCount = followersCount;
    }

    @JsonProperty("status")
    public Object getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(Object status) {
        this.status = status;
    }

    @JsonProperty("profileBackgroundColor")
    public String getProfileBackgroundColor() {
        return profileBackgroundColor;
    }

    @JsonProperty("profileBackgroundColor")
    public void setProfileBackgroundColor(String profileBackgroundColor) {
        this.profileBackgroundColor = profileBackgroundColor;
    }

    @JsonProperty("profileTextColor")
    public String getProfileTextColor() {
        return profileTextColor;
    }

    @JsonProperty("profileTextColor")
    public void setProfileTextColor(String profileTextColor) {
        this.profileTextColor = profileTextColor;
    }

    @JsonProperty("profileLinkColor")
    public String getProfileLinkColor() {
        return profileLinkColor;
    }

    @JsonProperty("profileLinkColor")
    public void setProfileLinkColor(String profileLinkColor) {
        this.profileLinkColor = profileLinkColor;
    }

    @JsonProperty("profileSidebarFillColor")
    public String getProfileSidebarFillColor() {
        return profileSidebarFillColor;
    }

    @JsonProperty("profileSidebarFillColor")
    public void setProfileSidebarFillColor(String profileSidebarFillColor) {
        this.profileSidebarFillColor = profileSidebarFillColor;
    }

    @JsonProperty("profileSidebarBorderColor")
    public String getProfileSidebarBorderColor() {
        return profileSidebarBorderColor;
    }

    @JsonProperty("profileSidebarBorderColor")
    public void setProfileSidebarBorderColor(String profileSidebarBorderColor) {
        this.profileSidebarBorderColor = profileSidebarBorderColor;
    }

    @JsonProperty("profileUseBackgroundImage")
    public Boolean getProfileUseBackgroundImage() {
        return profileUseBackgroundImage;
    }

    @JsonProperty("profileUseBackgroundImage")
    public void setProfileUseBackgroundImage(Boolean profileUseBackgroundImage) {
        this.profileUseBackgroundImage = profileUseBackgroundImage;
    }

    @JsonProperty("showAllInlineMedia")
    public Boolean getShowAllInlineMedia() {
        return showAllInlineMedia;
    }

    @JsonProperty("showAllInlineMedia")
    public void setShowAllInlineMedia(Boolean showAllInlineMedia) {
        this.showAllInlineMedia = showAllInlineMedia;
    }

    @JsonProperty("friendsCount")
    public Integer getFriendsCount() {
        return friendsCount;
    }

    @JsonProperty("friendsCount")
    public void setFriendsCount(Integer friendsCount) {
        this.friendsCount = friendsCount;
    }

    @JsonProperty("createdAt")
    public Integer getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("createdAt")
    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("favouritesCount")
    public Integer getFavouritesCount() {
        return favouritesCount;
    }

    @JsonProperty("favouritesCount")
    public void setFavouritesCount(Integer favouritesCount) {
        this.favouritesCount = favouritesCount;
    }

    @JsonProperty("utcOffset")
    public Integer getUtcOffset() {
        return utcOffset;
    }

    @JsonProperty("utcOffset")
    public void setUtcOffset(Integer utcOffset) {
        this.utcOffset = utcOffset;
    }

    @JsonProperty("timeZone")
    public Object getTimeZone() {
        return timeZone;
    }

    @JsonProperty("timeZone")
    public void setTimeZone(Object timeZone) {
        this.timeZone = timeZone;
    }

    @JsonProperty("profileBackgroundImageUrlHttps")
    public String getProfileBackgroundImageUrlHttps() {
        return profileBackgroundImageUrlHttps;
    }

    @JsonProperty("profileBackgroundImageUrlHttps")
    public void setProfileBackgroundImageUrlHttps(String profileBackgroundImageUrlHttps) {
        this.profileBackgroundImageUrlHttps = profileBackgroundImageUrlHttps;
    }

    @JsonProperty("profileBackgroundTiled")
    public Boolean getProfileBackgroundTiled() {
        return profileBackgroundTiled;
    }

    @JsonProperty("profileBackgroundTiled")
    public void setProfileBackgroundTiled(Boolean profileBackgroundTiled) {
        this.profileBackgroundTiled = profileBackgroundTiled;
    }

    @JsonProperty("lang")
    public String getLang() {
        return lang;
    }

    @JsonProperty("lang")
    public void setLang(String lang) {
        this.lang = lang;
    }

    @JsonProperty("statusesCount")
    public Integer getStatusesCount() {
        return statusesCount;
    }

    @JsonProperty("statusesCount")
    public void setStatusesCount(Integer statusesCount) {
        this.statusesCount = statusesCount;
    }

    @JsonProperty("translator")
    public Boolean getTranslator() {
        return translator;
    }

    @JsonProperty("translator")
    public void setTranslator(Boolean translator) {
        this.translator = translator;
    }

    @JsonProperty("listedCount")
    public Integer getListedCount() {
        return listedCount;
    }

    @JsonProperty("listedCount")
    public void setListedCount(Integer listedCount) {
        this.listedCount = listedCount;
    }

    @JsonProperty("withheldInCountries")
    public Object getWithheldInCountries() {
        return withheldInCountries;
    }

    @JsonProperty("withheldInCountries")
    public void setWithheldInCountries(Object withheldInCountries) {
        this.withheldInCountries = withheldInCountries;
    }

    @JsonProperty("protected")
    public Boolean getProtected() {
        return _protected;
    }

    @JsonProperty("protected")
    public void setProtected(Boolean _protected) {
        this._protected = _protected;
    }

    @JsonProperty("contributorsEnabled")
    public Boolean getContributorsEnabled() {
        return contributorsEnabled;
    }

    @JsonProperty("contributorsEnabled")
    public void setContributorsEnabled(Boolean contributorsEnabled) {
        this.contributorsEnabled = contributorsEnabled;
    }

    @JsonProperty("profileImageURL")
    public String getProfileImageURL() {
        return profileImageURL;
    }

    @JsonProperty("profileImageURL")
    public void setProfileImageURL(String profileImageURL) {
        this.profileImageURL = profileImageURL;
    }

    @JsonProperty("biggerProfileImageURL")
    public String getBiggerProfileImageURL() {
        return biggerProfileImageURL;
    }

    @JsonProperty("biggerProfileImageURL")
    public void setBiggerProfileImageURL(String biggerProfileImageURL) {
        this.biggerProfileImageURL = biggerProfileImageURL;
    }

    @JsonProperty("miniProfileImageURL")
    public String getMiniProfileImageURL() {
        return miniProfileImageURL;
    }

    @JsonProperty("miniProfileImageURL")
    public void setMiniProfileImageURL(String miniProfileImageURL) {
        this.miniProfileImageURL = miniProfileImageURL;
    }

    @JsonProperty("originalProfileImageURL")
    public String getOriginalProfileImageURL() {
        return originalProfileImageURL;
    }

    @JsonProperty("originalProfileImageURL")
    public void setOriginalProfileImageURL(String originalProfileImageURL) {
        this.originalProfileImageURL = originalProfileImageURL;
    }

    @JsonProperty("profileImageURLHttps")
    public String getProfileImageURLHttps() {
        return profileImageURLHttps;
    }

    @JsonProperty("profileImageURLHttps")
    public void setProfileImageURLHttps(String profileImageURLHttps) {
        this.profileImageURLHttps = profileImageURLHttps;
    }

    @JsonProperty("biggerProfileImageURLHttps")
    public String getBiggerProfileImageURLHttps() {
        return biggerProfileImageURLHttps;
    }

    @JsonProperty("biggerProfileImageURLHttps")
    public void setBiggerProfileImageURLHttps(String biggerProfileImageURLHttps) {
        this.biggerProfileImageURLHttps = biggerProfileImageURLHttps;
    }

    @JsonProperty("miniProfileImageURLHttps")
    public String getMiniProfileImageURLHttps() {
        return miniProfileImageURLHttps;
    }

    @JsonProperty("miniProfileImageURLHttps")
    public void setMiniProfileImageURLHttps(String miniProfileImageURLHttps) {
        this.miniProfileImageURLHttps = miniProfileImageURLHttps;
    }

    @JsonProperty("originalProfileImageURLHttps")
    public String getOriginalProfileImageURLHttps() {
        return originalProfileImageURLHttps;
    }

    @JsonProperty("originalProfileImageURLHttps")
    public void setOriginalProfileImageURLHttps(String originalProfileImageURLHttps) {
        this.originalProfileImageURLHttps = originalProfileImageURLHttps;
    }

    @JsonProperty("defaultProfileImage")
    public Boolean getDefaultProfileImage() {
        return defaultProfileImage;
    }

    @JsonProperty("defaultProfileImage")
    public void setDefaultProfileImage(Boolean defaultProfileImage) {
        this.defaultProfileImage = defaultProfileImage;
    }

    @JsonProperty("defaultProfile")
    public Boolean getDefaultProfile() {
        return defaultProfile;
    }

    @JsonProperty("defaultProfile")
    public void setDefaultProfile(Boolean defaultProfile) {
        this.defaultProfile = defaultProfile;
    }

    @JsonProperty("profileBackgroundImageURL")
    public String getProfileBackgroundImageURL() {
        return profileBackgroundImageURL;
    }

    @JsonProperty("profileBackgroundImageURL")
    public void setProfileBackgroundImageURL(String profileBackgroundImageURL) {
        this.profileBackgroundImageURL = profileBackgroundImageURL;
    }

    @JsonProperty("profileBannerURL")
    public String getProfileBannerURL() {
        return profileBannerURL;
    }

    @JsonProperty("profileBannerURL")
    public void setProfileBannerURL(String profileBannerURL) {
        this.profileBannerURL = profileBannerURL;
    }

    @JsonProperty("profileBannerRetinaURL")
    public String getProfileBannerRetinaURL() {
        return profileBannerRetinaURL;
    }

    @JsonProperty("profileBannerRetinaURL")
    public void setProfileBannerRetinaURL(String profileBannerRetinaURL) {
        this.profileBannerRetinaURL = profileBannerRetinaURL;
    }

    @JsonProperty("profileBannerIPadURL")
    public String getProfileBannerIPadURL() {
        return profileBannerIPadURL;
    }

    @JsonProperty("profileBannerIPadURL")
    public void setProfileBannerIPadURL(String profileBannerIPadURL) {
        this.profileBannerIPadURL = profileBannerIPadURL;
    }

    @JsonProperty("profileBannerIPadRetinaURL")
    public String getProfileBannerIPadRetinaURL() {
        return profileBannerIPadRetinaURL;
    }

    @JsonProperty("profileBannerIPadRetinaURL")
    public void setProfileBannerIPadRetinaURL(String profileBannerIPadRetinaURL) {
        this.profileBannerIPadRetinaURL = profileBannerIPadRetinaURL;
    }

    @JsonProperty("profileBannerMobileURL")
    public String getProfileBannerMobileURL() {
        return profileBannerMobileURL;
    }

    @JsonProperty("profileBannerMobileURL")
    public void setProfileBannerMobileURL(String profileBannerMobileURL) {
        this.profileBannerMobileURL = profileBannerMobileURL;
    }

    @JsonProperty("profileBannerMobileRetinaURL")
    public String getProfileBannerMobileRetinaURL() {
        return profileBannerMobileRetinaURL;
    }

    @JsonProperty("profileBannerMobileRetinaURL")
    public void setProfileBannerMobileRetinaURL(String profileBannerMobileRetinaURL) {
        this.profileBannerMobileRetinaURL = profileBannerMobileRetinaURL;
    }

    @JsonProperty("geoEnabled")
    public Boolean getGeoEnabled() {
        return geoEnabled;
    }

    @JsonProperty("geoEnabled")
    public void setGeoEnabled(Boolean geoEnabled) {
        this.geoEnabled = geoEnabled;
    }

    @JsonProperty("verified")
    public Boolean getVerified() {
        return verified;
    }

    @JsonProperty("verified")
    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    @JsonProperty("followRequestSent")
    public Boolean getFollowRequestSent() {
        return followRequestSent;
    }

    @JsonProperty("followRequestSent")
    public void setFollowRequestSent(Boolean followRequestSent) {
        this.followRequestSent = followRequestSent;
    }

    @JsonProperty("urlentity")
    public Urlentity_ getUrlentity() {
        return urlentity;
    }

    @JsonProperty("urlentity")
    public void setUrlentity(Urlentity_ urlentity) {
        this.urlentity = urlentity;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(rateLimitStatus).append(accessLevel).append(id).append(name).append(email).append(screenName).append(location).append(description).append(descriptionURLEntities).append(url).append(followersCount).append(status).append(profileBackgroundColor).append(profileTextColor).append(profileLinkColor).append(profileSidebarFillColor).append(profileSidebarBorderColor).append(profileUseBackgroundImage).append(showAllInlineMedia).append(friendsCount).append(createdAt).append(favouritesCount).append(utcOffset).append(timeZone).append(profileBackgroundImageUrlHttps).append(profileBackgroundTiled).append(lang).append(statusesCount).append(translator).append(listedCount).append(withheldInCountries).append(_protected).append(contributorsEnabled).append(profileImageURL).append(biggerProfileImageURL).append(miniProfileImageURL).append(originalProfileImageURL).append(profileImageURLHttps).append(biggerProfileImageURLHttps).append(miniProfileImageURLHttps).append(originalProfileImageURLHttps).append(defaultProfileImage).append(defaultProfile).append(profileBackgroundImageURL).append(profileBannerURL).append(profileBannerRetinaURL).append(profileBannerIPadURL).append(profileBannerIPadRetinaURL).append(profileBannerMobileURL).append(profileBannerMobileRetinaURL).append(geoEnabled).append(verified).append(followRequestSent).append(urlentity).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof User_) == false) {
            return false;
        }
        User_ rhs = ((User_) other);
        return new EqualsBuilder().append(rateLimitStatus, rhs.rateLimitStatus).append(accessLevel, rhs.accessLevel).append(id, rhs.id).append(name, rhs.name).append(email, rhs.email).append(screenName, rhs.screenName).append(location, rhs.location).append(description, rhs.description).append(descriptionURLEntities, rhs.descriptionURLEntities).append(url, rhs.url).append(followersCount, rhs.followersCount).append(status, rhs.status).append(profileBackgroundColor, rhs.profileBackgroundColor).append(profileTextColor, rhs.profileTextColor).append(profileLinkColor, rhs.profileLinkColor).append(profileSidebarFillColor, rhs.profileSidebarFillColor).append(profileSidebarBorderColor, rhs.profileSidebarBorderColor).append(profileUseBackgroundImage, rhs.profileUseBackgroundImage).append(showAllInlineMedia, rhs.showAllInlineMedia).append(friendsCount, rhs.friendsCount).append(createdAt, rhs.createdAt).append(favouritesCount, rhs.favouritesCount).append(utcOffset, rhs.utcOffset).append(timeZone, rhs.timeZone).append(profileBackgroundImageUrlHttps, rhs.profileBackgroundImageUrlHttps).append(profileBackgroundTiled, rhs.profileBackgroundTiled).append(lang, rhs.lang).append(statusesCount, rhs.statusesCount).append(translator, rhs.translator).append(listedCount, rhs.listedCount).append(withheldInCountries, rhs.withheldInCountries).append(_protected, rhs._protected).append(contributorsEnabled, rhs.contributorsEnabled).append(profileImageURL, rhs.profileImageURL).append(biggerProfileImageURL, rhs.biggerProfileImageURL).append(miniProfileImageURL, rhs.miniProfileImageURL).append(originalProfileImageURL, rhs.originalProfileImageURL).append(profileImageURLHttps, rhs.profileImageURLHttps).append(biggerProfileImageURLHttps, rhs.biggerProfileImageURLHttps).append(miniProfileImageURLHttps, rhs.miniProfileImageURLHttps).append(originalProfileImageURLHttps, rhs.originalProfileImageURLHttps).append(defaultProfileImage, rhs.defaultProfileImage).append(defaultProfile, rhs.defaultProfile).append(profileBackgroundImageURL, rhs.profileBackgroundImageURL).append(profileBannerURL, rhs.profileBannerURL).append(profileBannerRetinaURL, rhs.profileBannerRetinaURL).append(profileBannerIPadURL, rhs.profileBannerIPadURL).append(profileBannerIPadRetinaURL, rhs.profileBannerIPadRetinaURL).append(profileBannerMobileURL, rhs.profileBannerMobileURL).append(profileBannerMobileRetinaURL, rhs.profileBannerMobileRetinaURL).append(geoEnabled, rhs.geoEnabled).append(verified, rhs.verified).append(followRequestSent, rhs.followRequestSent).append(urlentity, rhs.urlentity).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
