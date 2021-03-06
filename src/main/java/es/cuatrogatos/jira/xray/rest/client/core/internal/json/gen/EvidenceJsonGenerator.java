package es.cuatrogatos.jira.xray.rest.client.core.internal.json.gen;

import com.atlassian.jira.rest.client.internal.json.gen.JsonGenerator;
import es.cuatrogatos.jira.xray.rest.client.api.domain.Evidence;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

/**
 * Created by lucho on 23/08/16.
 */
public class EvidenceJsonGenerator implements JsonGenerator<Evidence> {
    public static final String KEY_ID="id";
    public static final String KEY_FILENAME="fileName";
    public static final String KEY_FILESIZE="fileSize";
    public static final String KEY_CREATED="created";
    public static final String KEY_AUTHOR="author";
    public static final String KEY_FILEURI="fileURL";


    public JSONObject generate(Evidence evidence) throws JSONException {
        return new JSONObject().put(KEY_ID,evidence.getId())
                .put(KEY_FILENAME,evidence.getFileName())
                .put(KEY_FILESIZE,evidence.getFileSize())
                .put(KEY_CREATED,evidence.getCreated())
                .put(KEY_AUTHOR,evidence.getAuthor())
                .put(KEY_FILEURI,evidence.getFileURL());
    }
}
