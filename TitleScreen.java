import mayflower.*;
public class TitleScreen extends Stage
{
    public TitleScreen()
    {
        setBackground("img/titlescreen.jpg"); //get this image
        Button play = new Button("img/play.png","img/playhovered.png",null,
        null,new StageOne(),270,120); //get click sound
        addActor(play,215,302);
    }
    public void update()
    {
    }
}

