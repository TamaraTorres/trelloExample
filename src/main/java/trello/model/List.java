package trello.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class List
{
    private String idBoard;

    private String pos;

    private String name;

    private String closed;

    private String id;

    @JsonIgnore
    private String limits;

    public String getIdBoard ()
    {
        return idBoard;
    }

    public void setIdBoard (String idBoard)
    {
        this.idBoard = idBoard;
    }

    public String getPos ()
    {
        return pos;
    }

    public void setPos (String pos)
    {
        this.pos = pos;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
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

    @Override
    public String toString()
    {
        return "ClassPojo [idBoard = "+idBoard+", pos = "+pos+", name = "+name+", closed = "+closed+", id = "+id+", limits = "+limits+"]";
    }
}

