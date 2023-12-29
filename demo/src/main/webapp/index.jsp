<!DOCTYPE html>
<html>
    <head>
        <title> Partida de futebol </title>
    </head>
    <body>
        <h2>Partida de futebol</h2>
        <form action="matchController" method="post">
            <p> HOME </p>
            <input type="text" name="home">
            <p>HOME SCORE </p>
            <input type="text" name="homeScore">
            <br> 
            <p> AWAY </p>
            <input type="text" name="visitor">
            <p> AWAY SCORE </p>
            <input type="text" name="awayScore">
            <br>
            <input id="Button" type="submit" name="Envio" value="Salvar">
        </form>
    </body>
</html>
