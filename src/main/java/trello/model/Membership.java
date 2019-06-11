package trello.model;

public class Membership
{
    private String unconfirmed;

    private String idMember;

    private String id;

    private String memberType;

    private String deactivated;

    public String getUnconfirmed ()
    {
        return unconfirmed;
    }

    public void setUnconfirmed (String unconfirmed)
    {
        this.unconfirmed = unconfirmed;
    }

    public String getIdMember ()
    {
        return idMember;
    }

    public void setIdMember (String idMember)
    {
        this.idMember = idMember;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getMemberType ()
    {
        return memberType;
    }

    public void setMemberType (String memberType)
    {
        this.memberType = memberType;
    }

    public String getDeactivated ()
    {
        return deactivated;
    }

    public void setDeactivated (String deactivated)
    {
        this.deactivated = deactivated;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [unconfirmed = "+unconfirmed+", idMember = "+idMember+", id = "+id+", memberType = "+memberType+", deactivated = "+deactivated+"]";
    }
}
