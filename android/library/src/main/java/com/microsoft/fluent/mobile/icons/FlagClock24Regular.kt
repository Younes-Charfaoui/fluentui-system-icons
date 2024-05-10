package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.FlagClock24: ImageVector
  get() {
    if (_flagClock24 != null) {
      return _flagClock24!!
    }
    _flagClock24 = fluentIcon(name = "Regular.FlagClock24", 24f) {
      materialPath {
          moveTo(3.75F, 2.998F)
          curveTo(3.336F, 2.998F, 3.0F, 3.334F, 3.0F, 3.748F)
          verticalLineTo(21.25F)
          lineToRelative(0.007F, 0.102F)
          curveTo(3.057F, 21.718F, 3.37F, 22.0F, 3.75F, 22.0F)
          lineToRelative(0.102F, -0.007F)
          curveTo(4.218F, 21.943F, 4.5F, 21.63F, 4.5F, 21.25F)
          verticalLineTo(16.5F)
          horizontalLineToRelative(6.576F)
          curveToRelative(0.081F, -0.523F, 0.224F, -1.025F, 0.422F, -1.5F)
          horizontalLineTo(4.5F)
          verticalLineTo(4.498F)
          horizontalLineToRelative(14.254F)
          lineTo(15.152F, 9.3F)
          curveToRelative(-0.2F, 0.267F, -0.2F, 0.634F, 0.0F, 0.9F)
          lineToRelative(0.75F, 0.999F)
          curveTo(16.411F, 11.068F, 16.947F, 11.0F, 17.5F, 11.0F)
          lineToRelative(0.129F, 0.001F)
          lineToRelative(-0.94F, -1.252F)
          lineToRelative(4.165F, -5.55F)
          curveToRelative(0.371F, -0.495F, 0.018F, -1.201F, -0.6F, -1.201F)
          horizontalLineTo(3.75F)
          close()
          moveTo(23.0F, 17.5F)
          curveToRelative(0.0F, -3.038F, -2.462F, -5.5F, -5.5F, -5.5F)
          reflectiveCurveTo(12.0F, 14.462F, 12.0F, 17.5F)
          reflectiveCurveToRelative(2.462F, 5.5F, 5.5F, 5.5F)
          reflectiveCurveToRelative(5.5F, -2.462F, 5.5F, -5.5F)
          close()
          moveTo(17.5F, 14.0F)
          curveToRelative(0.276F, 0.0F, 0.5F, 0.224F, 0.5F, 0.5F)
          verticalLineTo(17.0F)
          horizontalLineToRelative(2.0F)
          curveToRelative(0.276F, 0.0F, 0.5F, 0.224F, 0.5F, 0.5F)
          reflectiveCurveTo(20.276F, 18.0F, 20.0F, 18.0F)
          horizontalLineToRelative(-2.5F)
          curveToRelative(-0.276F, 0.0F, -0.5F, -0.224F, -0.5F, -0.5F)
          verticalLineToRelative(-3.0F)
          curveToRelative(0.0F, -0.276F, 0.224F, -0.5F, 0.5F, -0.5F)
          close()        
      }
    }
    return _flagClock24!!
  }

private var _flagClock24: ImageVector? = null
