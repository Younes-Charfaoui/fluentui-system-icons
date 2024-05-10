package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.SlidePlay24: ImageVector
  get() {
    if (_slidePlay24 != null) {
      return _slidePlay24!!
    }
    _slidePlay24 = fluentIcon(name = "Filled.SlidePlay24", 24f) {
      materialPath {
          moveTo(2.0F, 6.75F)
          curveTo(2.0F, 5.231F, 3.231F, 4.0F, 4.75F, 4.0F)
          horizontalLineToRelative(14.5F)
          curveTo(20.769F, 4.0F, 22.0F, 5.231F, 22.0F, 6.75F)
          verticalLineToRelative(6.06F)
          curveTo(20.832F, 11.689F, 19.247F, 11.0F, 17.5F, 11.0F)
          curveToRelative(-3.59F, 0.0F, -6.5F, 2.91F, -6.5F, 6.5F)
          curveToRelative(0.0F, 0.886F, 0.177F, 1.73F, 0.498F, 2.5F)
          horizontalLineTo(4.75F)
          curveTo(3.231F, 20.0F, 2.0F, 18.769F, 2.0F, 17.25F)
          verticalLineTo(6.75F)
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
