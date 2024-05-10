package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.SlidePlay24: ImageVector
  get() {
    if (_slidePlay24 != null) {
      return _slidePlay24!!
    }
    _slidePlay24 = fluentIcon(name = "Regular.SlidePlay24", 24f) {
      materialPath {
          moveTo(4.75F, 4.0F)
          curveTo(3.231F, 4.0F, 2.0F, 5.231F, 2.0F, 6.75F)
          verticalLineToRelative(10.5F)
          curveTo(2.0F, 18.769F, 3.231F, 20.0F, 4.75F, 20.0F)
          horizontalLineToRelative(6.748F)
          curveToRelative(-0.198F, -0.474F, -0.34F, -0.977F, -0.422F, -1.5F)
          horizontalLineTo(4.75F)
          curveToRelative(-0.69F, 0.0F, -1.25F, -0.56F, -1.25F, -1.25F)
          verticalLineTo(6.75F)
          curveToRelative(0.0F, -0.69F, 0.56F, -1.25F, 1.25F, -1.25F)
          horizontalLineToRelative(14.5F)
          curveToRelative(0.69F, 0.0F, 1.25F, 0.56F, 1.25F, 1.25F)
          verticalLineToRelative(4.982F)
          curveToRelative(0.551F, 0.287F, 1.056F, 0.651F, 1.5F, 1.078F)
          verticalLineTo(6.75F)
          curveTo(22.0F, 5.231F, 20.769F, 4.0F, 19.25F, 4.0F)
          horizontalLineTo(4.75F)
          close()
          moveTo(23.0F, 17.5F)
          curveToRelative(0.0F, 3.038F, -2.462F, 5.5F, -5.5F, 5.5F)
          reflectiveCurveTo(12.0F, 20.538F, 12.0F, 17.5F)
          reflectiveCurveToRelative(2.462F, -5.5F, 5.5F, -5.5F)
          reflectiveCurveToRelative(5.5F, 2.462F, 5.5F, 5.5F)
          close()
          moveToRelative(-7.0F, 1.999F)
          curveToRelative(0.0F, 0.4F, 0.445F, 0.638F, 0.777F, 0.416F)
          lineToRelative(3.002F, -1.999F)
          curveToRelative(0.297F, -0.198F, 0.297F, -0.634F, 0.0F, -0.832F)
          lineToRelative(-3.002F, -2.0F)
          curveTo(16.445F, 14.865F, 16.0F, 15.103F, 16.0F, 15.502F)
          verticalLineTo(19.5F)
          close()        
      }
    }
    return _slidePlay24!!
  }

private var _slidePlay24: ImageVector? = null
