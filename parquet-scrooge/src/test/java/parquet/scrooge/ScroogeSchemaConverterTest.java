package parquet.scrooge;

import org.junit.Test;
import parquet.scrooge.test.TestMapPrimitiveKey;
import parquet.scrooge.test.TestMapPrimitiveValue;
import parquet.scrooge.test.TestOptionalMap;
import parquet.thrift.ThriftSchemaConverter;
import parquet.thrift.struct.ThriftType;

import static junit.framework.Assert.assertEquals;

/**
 * Test convert scrooge schema to Parquet Schema
 */
public class ScroogeSchemaConverterTest {
  @Test
  public void testConvertPrimitiveMapKey() throws Exception{
    ThriftType.StructType scroogeMap = new ScroogeSchemaConverter().convert(TestMapPrimitiveKey.class);
    ThriftType.StructType expected = new ThriftSchemaConverter().toStructType(parquet.thrift.test.TestMapPrimitiveKey.class);
    assertEquals(expected.toJSON(),scroogeMap.toJSON());
  }

  @Test
  public void testConvertPrimitiveMapValue() throws Exception{
    ThriftType.StructType scroogeMap = new ScroogeSchemaConverter().convert(TestMapPrimitiveValue.class);
    ThriftType.StructType expected = new ThriftSchemaConverter().toStructType(parquet.thrift.test.TestMapPrimitiveValue.class);
    assertEquals(expected.toJSON(),scroogeMap.toJSON());
  }

  @Test
  public void testConvertOptionalPrimitiveMap() throws Exception{
    ThriftType.StructType scroogeMap = new ScroogeSchemaConverter().convert(TestOptionalMap.class);
    ThriftType.StructType expected = new ThriftSchemaConverter().toStructType(parquet.thrift.test.TestOptionalMap.class);
    String expectedString="{\n" +
            "  \"id\" : \"STRUCT\",\n" +
            "  \"children\" : [ {\n" +
            "    \"name\" : \"short_map\",\n" +
            "    \"fieldId\" : 1,\n" +
            "    \"requirement\" : \"OPTIONAL\",\n" +
            "    \"type\" : {\n" +
            "      \"id\" : \"MAP\",\n" +
            "      \"key\" : {\n" +
            "        \"name\" : \"short_map_map_key\",\n" +
            "        \"fieldId\" : 1,\n" +
            "        \"requirement\" : \"REQUIRED\",\n" +
            "        \"type\" : {\n" +
            "          \"id\" : \"I16\"\n" +
            "        }\n" +
            "      },\n" +
            "      \"value\" : {\n" +
            "        \"name\" : \"short_map_map_value\",\n" +
            "        \"fieldId\" : 1,\n" +
            "        \"requirement\" : \"REQUIRED\",\n" +
            "        \"type\" : {\n" +
            "          \"id\" : \"STRING\"\n" +
            "        }\n" +
            "      }\n" +
            "    }\n" +
            "  }, {\n" +
            "    \"name\" : \"int_map\",\n" +
            "    \"fieldId\" : 2,\n" +
            "    \"requirement\" : \"OPTIONAL\",\n" +
            "    \"type\" : {\n" +
            "      \"id\" : \"MAP\",\n" +
            "      \"key\" : {\n" +
            "        \"name\" : \"int_map_map_key\",\n" +
            "        \"fieldId\" : 1,\n" +
            "        \"requirement\" : \"REQUIRED\",\n" +
            "        \"type\" : {\n" +
            "          \"id\" : \"I32\"\n" +
            "        }\n" +
            "      },\n" +
            "      \"value\" : {\n" +
            "        \"name\" : \"int_map_map_value\",\n" +
            "        \"fieldId\" : 1,\n" +
            "        \"requirement\" : \"REQUIRED\",\n" +
            "        \"type\" : {\n" +
            "          \"id\" : \"STRING\"\n" +
            "        }\n" +
            "      }\n" +
            "    }\n" +
            "  }, {\n" +
            "    \"name\" : \"byt_map\",\n" +
            "    \"fieldId\" : 3,\n" +
            "    \"requirement\" : \"OPTIONAL\",\n" +
            "    \"type\" : {\n" +
            "      \"id\" : \"MAP\",\n" +
            "      \"key\" : {\n" +
            "        \"name\" : \"byt_map_map_key\",\n" +
            "        \"fieldId\" : 1,\n" +
            "        \"requirement\" : \"REQUIRED\",\n" +
            "        \"type\" : {\n" +
            "          \"id\" : \"BYTE\"\n" +
            "        }\n" +
            "      },\n" +
            "      \"value\" : {\n" +
            "        \"name\" : \"byt_map_map_value\",\n" +
            "        \"fieldId\" : 1,\n" +
            "        \"requirement\" : \"REQUIRED\",\n" +
            "        \"type\" : {\n" +
            "          \"id\" : \"STRING\"\n" +
            "        }\n" +
            "      }\n" +
            "    }\n" +
            "  }, {\n" +
            "    \"name\" : \"bool_map\",\n" +
            "    \"fieldId\" : 4,\n" +
            "    \"requirement\" : \"OPTIONAL\",\n" +
            "    \"type\" : {\n" +
            "      \"id\" : \"MAP\",\n" +
            "      \"key\" : {\n" +
            "        \"name\" : \"bool_map_map_key\",\n" +
            "        \"fieldId\" : 1,\n" +
            "        \"requirement\" : \"REQUIRED\",\n" +
            "        \"type\" : {\n" +
            "          \"id\" : \"BOOL\"\n" +
            "        }\n" +
            "      },\n" +
            "      \"value\" : {\n" +
            "        \"name\" : \"bool_map_map_value\",\n" +
            "        \"fieldId\" : 1,\n" +
            "        \"requirement\" : \"REQUIRED\",\n" +
            "        \"type\" : {\n" +
            "          \"id\" : \"STRING\"\n" +
            "        }\n" +
            "      }\n" +
            "    }\n" +
            "  }, {\n" +
            "    \"name\" : \"long_map\",\n" +
            "    \"fieldId\" : 5,\n" +
            "    \"requirement\" : \"OPTIONAL\",\n" +
            "    \"type\" : {\n" +
            "      \"id\" : \"MAP\",\n" +
            "      \"key\" : {\n" +
            "        \"name\" : \"long_map_map_key\",\n" +
            "        \"fieldId\" : 1,\n" +
            "        \"requirement\" : \"REQUIRED\",\n" +
            "        \"type\" : {\n" +
            "          \"id\" : \"I64\"\n" +
            "        }\n" +
            "      },\n" +
            "      \"value\" : {\n" +
            "        \"name\" : \"long_map_map_value\",\n" +
            "        \"fieldId\" : 1,\n" +
            "        \"requirement\" : \"REQUIRED\",\n" +
            "        \"type\" : {\n" +
            "          \"id\" : \"STRING\"\n" +
            "        }\n" +
            "      }\n" +
            "    }\n" +
            "  }, {\n" +
            "    \"name\" : \"double_map\",\n" +
            "    \"fieldId\" : 6,\n" +
            "    \"requirement\" : \"OPTIONAL\",\n" +
            "    \"type\" : {\n" +
            "      \"id\" : \"MAP\",\n" +
            "      \"key\" : {\n" +
            "        \"name\" : \"double_map_map_key\",\n" +
            "        \"fieldId\" : 1,\n" +
            "        \"requirement\" : \"REQUIRED\",\n" +
            "        \"type\" : {\n" +
            "          \"id\" : \"DOUBLE\"\n" +
            "        }\n" +
            "      },\n" +
            "      \"value\" : {\n" +
            "        \"name\" : \"double_map_map_value\",\n" +
            "        \"fieldId\" : 1,\n" +
            "        \"requirement\" : \"REQUIRED\",\n" +
            "        \"type\" : {\n" +
            "          \"id\" : \"STRING\"\n" +
            "        }\n" +
            "      }\n" +
            "    }\n" +
            "  }, {\n" +
            "    \"name\" : \"string_map\",\n" +
            "    \"fieldId\" : 7,\n" +
            "    \"requirement\" : \"OPTIONAL\",\n" +
            "    \"type\" : {\n" +
            "      \"id\" : \"MAP\",\n" +
            "      \"key\" : {\n" +
            "        \"name\" : \"string_map_map_key\",\n" +
            "        \"fieldId\" : 1,\n" +
            "        \"requirement\" : \"REQUIRED\",\n" +
            "        \"type\" : {\n" +
            "          \"id\" : \"STRING\"\n" +
            "        }\n" +
            "      },\n" +
            "      \"value\" : {\n" +
            "        \"name\" : \"string_map_map_value\",\n" +
            "        \"fieldId\" : 1,\n" +
            "        \"requirement\" : \"REQUIRED\",\n" +
            "        \"type\" : {\n" +
            "          \"id\" : \"STRING\"\n" +
            "        }\n" +
            "      }\n" +
            "    }\n" +
            "  } ]\n" +
            "}";
    assertEquals(expectedString,scroogeMap.toJSON());
  }
}