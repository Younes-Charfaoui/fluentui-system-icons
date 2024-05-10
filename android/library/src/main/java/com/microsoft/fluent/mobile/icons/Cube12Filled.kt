package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Cube12: ImageVector
  get() {
    if (_cube12 != null) {
      return _cube12!!
    }
    _cube12 = fluentIcon(name = "Filled.Cube12", 12f) {
      materialPath {
          moveTo(5.449F, 1.105F)
          curveToRelative(0.354F, -0.14F, 0.748F, -0.14F, 1.102F, 0.0F)
          lineToRelative(3.5F, 1.384F)
          curveTo(10.624F, 2.715F, 11.0F, 3.268F, 11.0F, 3.884F)
          verticalLineToRelative(4.23F)
          curveToRelative(0.0F, 0.616F, -0.376F, 1.17F, -0.949F, 1.395F)
          lineToRelative(-3.5F, 1.384F)
          curveToRelative(-0.354F, 0.14F, -0.748F, 0.14F, -1.102F, 0.0F)
          lineToRelative(-3.5F, -1.384F)
          curveTo(1.376F, 9.283F, 1.0F, 8.73F, 1.0F, 8.114F)
          verticalLineToRelative(-4.23F)
          curveToRelative(0.0F, -0.616F, 0.376F, -1.17F, 0.948F, -1.395F)
          lineToRelative(3.5F, -1.384F)
          close()
          moveToRelative(-1.763F, 2.93F)
          curveToRelative(-0.257F, -0.102F, -0.548F, 0.023F, -0.65F, 0.28F)
          curveToRelative(-0.103F, 0.256F, 0.022F, 0.547F, 0.278F, 0.65F)
          lineTo(5.5F, 5.837F)
          verticalLineTo(8.0F)
          curveToRelative(0.0F, 0.276F, 0.224F, 0.5F, 0.5F, 0.5F)
          reflectiveCurveTo(6.5F, 8.276F, 6.5F, 8.0F)
          verticalLineTo(5.838F)
          lineToRelative(2.186F, -0.874F)
          curveToRelative(0.256F, -0.102F, 0.38F, -0.393F, 0.278F, -0.65F)
          curveToRelative(-0.102F, -0.256F, -0.393F, -0.38F, -0.65F, -0.278F)
          lineTo(6.0F, 4.962F)
          lineTo(3.686F, 4.035F)
          close()        
      }
    }
    return _cube12!!
  }

private var _cube12: ImageVector? = null
