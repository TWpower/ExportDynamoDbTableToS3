// Java 1.x
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.model.ExportTableToPointInTimeRequest;
// Java 2.x
/*
import software.amazon.awssdk.services.dynamodb.model.ExportTableToPointInTimeRequest;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;
*/

public class ExportDynamoDbTableToS3 {
    public static void main(String[] args) {

        // Please fill out below values
        String tableArn = "";
        String s3Bucket = "";
        String s3Prefix = "";
        String exportFormat = "";
        String s3BucketOwner = "";

        // Use one of versions in below

        // Java 1.x
        AmazonDynamoDB amazonDynamoDB = AmazonDynamoDBClientBuilder.defaultClient();
        ExportTableToPointInTimeRequest exportTableToPointInTimeRequest = new ExportTableToPointInTimeRequest();

        exportTableToPointInTimeRequest.setTableArn(tableArn);
        exportTableToPointInTimeRequest.setS3Bucket(s3Bucket);
        exportTableToPointInTimeRequest.setS3Prefix(s3Prefix);
        exportTableToPointInTimeRequest.setExportFormat(exportFormat);
        exportTableToPointInTimeRequest.setS3BucketOwner(s3BucketOwner);

        amazonDynamoDB.exportTableToPointInTime(exportTableToPointInTimeRequest);

        // Java 2.x
        /*
        DynamoDbClient dynamoDbClient = DynamoDbClient.builder().build();
        ExportTableToPointInTimeRequest exportTableToPointInTimeRequest = ExportTableToPointInTimeRequest
                .builder()
                .tableArn(tableArn)
                .s3Bucket(s3Bucket)
                .s3Prefix(s3Prefix)
                .exportFormat(exportFormat)
                .s3BucketOwner(s3BucketOwner)
                .build();

        dynamoDbClient.exportTableToPointInTime(exportTableToPointInTimeRequest);
         */
    }
}
