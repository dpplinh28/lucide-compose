package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LightbulbOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.8f, 11.2f)
                curveToRelative(.8f, -.9f, 1.2f, -2f, 1.2f, -3.2f)
                arcToRelative(6f, 6f, 0f, false, false, -9.3f, -5f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 2f)
                lineToRelative(20f, 20f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.3f, 6.3f)
                arcToRelative(4.67f, 4.67f, 0f, false, false, 1.2f, 5.2f)
                curveToRelative(.7f, .7f, 1.3f, 1.5f, 1.5f, 2.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 18f)
                horizontalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(10f, 22f)
                horizontalLineToRelative(4f)
            }
}

public val LucideIcons.All.LightbulbOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LightbulbOff: ImageVector
    @Composable get() = LightbulbOffDefinition.asImageVector()
