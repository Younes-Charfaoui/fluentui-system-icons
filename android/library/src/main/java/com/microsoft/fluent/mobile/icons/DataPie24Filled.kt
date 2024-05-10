package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.DataPie24: ImageVector
  get() {
    if (_dataPie24 != null) {
      return _dataPie24!!
    }
    _dataPie24 = fluentIcon(name = "Filled.DataPie24", 24f) {
      materialPath {
          moveTo(12.728F, 2.216F)
          curveToRelative(0.145F, -0.142F, 0.342F, -0.218F, 0.544F, -0.212F)
          curveToRelative(4.755F, 0.142F, 8.583F, 3.97F, 8.724F, 8.724F)
          curveToRelative(0.006F, 0.202F, -0.07F, 0.399F, -0.212F, 0.544F)
          curveToRelative(-0.14F, 0.146F, -0.335F, 0.228F, -0.538F, 0.228F)
          horizontalLineTo(13.25F)
          curveToRelative(-0.414F, 0.0F, -0.75F, -0.336F, -0.75F, -0.75F)
          verticalLineTo(2.754F)
          curveToRelative(0.0F, -0.203F, 0.082F, -0.397F, 0.228F, -0.538F)
          close()
          moveTo(11.0F, 4.784F)
          curveToRelative(0.0F, -0.21F, -0.089F, -0.412F, -0.244F, -0.554F)
          curveToRelative(-0.155F, -0.142F, -0.364F, -0.212F, -0.573F, -0.193F)
          curveTo(5.595F, 4.45F, 2.0F, 8.305F, 2.0F, 13.0F)
          curveToRelative(0.0F, 4.97F, 4.03F, 9.0F, 9.0F, 9.0F)
          curveToRelative(4.695F, 0.0F, 8.55F, -3.595F, 8.963F, -8.183F)
          curveToRelative(0.02F, -0.21F, -0.05F, -0.417F, -0.193F, -0.573F)
          curveTo(19.628F, 13.09F, 19.427F, 13.0F, 19.216F, 13.0F)
          horizontalLineTo(11.0F)
          verticalLineTo(4.784F)
          close()        
      }
    }
    return _dataPie24!!
  }

private var _dataPie24: ImageVector? = null
