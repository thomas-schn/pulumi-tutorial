package myproject;

import com.pulumi.Pulumi;
import com.pulumi.aws.s3.Bucket;
import com.pulumi.aws.s3.BucketArgs;

public class App {
    public static void main(String[] args) {
        Pulumi.run(ctx -> {
            var bucket = new Bucket("my-bucket",
                    BucketArgs.builder()
                            .forceDestroy(false)
                            .bucket("must-be-unique-for-aws")
                            .acl("public-read")
                            .build());
            ctx.export("forceDestroy", bucket.forceDestroy());
            ctx.export("bucketName", bucket.bucket());
        });



    
    }
}
