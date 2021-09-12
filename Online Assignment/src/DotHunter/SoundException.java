package DotHunter;

/**
 * @author :B.M.S.L.Bandaranayaka <IT 20643218>
 * @Time :10.00AM;
 * @since :2021.09.11;
 **/
public class SoundException extends Exception{

    private final String Sound;

    public SoundException(String Sound) {
            this.Sound = Sound;
        }


}
