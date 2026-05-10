package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Carrot") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.27f, 21.7f)
                reflectiveCurveToRelative(9.87f, -3.5f, 12.73f, -6.36f)
                arcToRelative(4.5f, 4.5f, 0f, false, false, -6.36f, -6.37f)
                curveTo(5.77f, 11.84f, 2.27f, 21.7f, 2.27f, 21.7f)
                close()
                moveTo(8.64f, 14f)
                lineToRelative(-2.05f, -2.04f)
                moveTo(15.34f, 15f)
                lineToRelative(-2.46f, -2.46f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 9f)
                reflectiveCurveToRelative(-1.33f, -2f, -3.5f, -2f)
                curveTo(16.86f, 7f, 15f, 9f, 15f, 9f)
                reflectiveCurveToRelative(1.33f, 2f, 3.5f, 2f)
                reflectiveCurveTo(22f, 9f, 22f, 9f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 2f)
                reflectiveCurveToRelative(-2f, 1.33f, -2f, 3.5f)
                reflectiveCurveTo(15f, 9f, 15f, 9f)
                reflectiveCurveToRelative(2f, -1.84f, 2f, -3.5f)
                curveTo(17f, 3.33f, 15f, 2f, 15f, 2f)
                close()
            }
}

public val LucideIcons.All.CarrotDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Carrot: ImageVector
    @Composable get() = CarrotDefinition.asImageVector()
