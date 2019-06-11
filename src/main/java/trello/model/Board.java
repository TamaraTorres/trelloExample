package trello.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Board
{
    private String descData;

    private String[] idTags;

    private boolean pinned;

    private LabelNames labelNames;

    private String shortUrl;

    private String dateLastActivity;

    private String datePluginDisable;

    private String shortLink;

    private String url;

    private Membership[] memberships;

    private String creationMethod;

    private Prefs prefs;

    private String subscribed;

    private String ixUpdate;

    private String starred;

    private String name;

    private String idOrganization;

    private String dateLastView;

    private String closed;

    private String id;

    @JsonIgnore
    private String limits;

    private String desc;

    private String[] powerUps;

    public String getDescData ()
{
    return descData;
}

    public void setDescData (String descData)
    {
        this.descData = descData;
    }

    public String[] getIdTags ()
    {
        return idTags;
    }

    public void setIdTags (String[] idTags)
    {
        this.idTags = idTags;
    }

    public boolean getPinned ()
{
    return pinned;
}

    public void setPinned (boolean pinned)
    {
        this.pinned = pinned;
    }

    public LabelNames getLabelNames ()
    {
        return labelNames;
    }

    public void setLabelNames (LabelNames labelNames)
    {
        this.labelNames = labelNames;
    }

    public String getShortUrl ()
    {
        return shortUrl;
    }

    public void setShortUrl (String shortUrl)
    {
        this.shortUrl = shortUrl;
    }

    public String getDateLastActivity ()
    {
        return dateLastActivity;
    }

    public void setDateLastActivity (String dateLastActivity)
    {
        this.dateLastActivity = dateLastActivity;
    }

    public String getDatePluginDisable ()
{
    return datePluginDisable;
}

    public void setDatePluginDisable (String datePluginDisable)
    {
        this.datePluginDisable = datePluginDisable;
    }

    public String getShortLink ()
    {
        return shortLink;
    }

    public void setShortLink (String shortLink)
    {
        this.shortLink = shortLink;
    }

    public String getUrl ()
    {
        return url;
    }

    public void setUrl (String url)
    {
        this.url = url;
    }

    public Membership[] getMemberships ()
    {
        return memberships;
    }

    public void setMemberships (Membership[] memberships)
    {
        this.memberships = memberships;
    }

    public String getCreationMethod ()
    {
        return creationMethod;
    }

    public void setCreationMethod (String creationMethod)
    {
        this.creationMethod = creationMethod;
    }

    public Prefs getPrefs ()
    {
        return prefs;
    }

    public void setPrefs (Prefs prefs)
    {
        this.prefs = prefs;
    }

    public String getSubscribed ()
    {
        return subscribed;
    }

    public void setSubscribed (String subscribed)
    {
        this.subscribed = subscribed;
    }

    public String getIxUpdate ()
{
    return ixUpdate;
}

    public void setIxUpdate (String ixUpdate)
    {
        this.ixUpdate = ixUpdate;
    }

    public String getStarred ()
    {
        return starred;
    }

    public void setStarred (String starred)
    {
        this.starred = starred;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getIdOrganization ()
{
    return idOrganization;
}

    public void setIdOrganization (String idOrganization)
    {
        this.idOrganization = idOrganization;
    }

    public String getDateLastView ()
    {
        return dateLastView;
    }

    public void setDateLastView (String dateLastView)
    {
        this.dateLastView = dateLastView;
    }

    public String getClosed ()
    {
        return closed;
    }

    public void setClosed (String closed)
    {
        this.closed = closed;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getLimits ()
{
    return limits;
}

    public void setLimits (String limits)
    {
        this.limits = limits;
    }

    public String getDesc ()
    {
        return desc;
    }

    public void setDesc (String desc)
    {
        this.desc = desc;
    }

    public String[] getPowerUps ()
    {
        return powerUps;
    }

    public void setPowerUps (String[] powerUps)
    {
        this.powerUps = powerUps;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [descData = "+descData+", idTags = "+idTags+", pinned = "+pinned+", labelNames = "+labelNames+", shortUrl = "+shortUrl+", dateLastActivity = "+dateLastActivity+", datePluginDisable = "+datePluginDisable+", shortLink = "+shortLink+", url = "+url+", memberships = "+memberships+", creationMethod = "+creationMethod+", prefs = "+prefs+", subscribed = "+subscribed+", ixUpdate = "+ixUpdate+", starred = "+starred+", name = "+name+", idOrganization = "+idOrganization+", dateLastView = "+dateLastView+", closed = "+closed+", id = "+id+", limits = "+limits+", desc = "+desc+", powerUps = "+powerUps+"]";
    }
}
