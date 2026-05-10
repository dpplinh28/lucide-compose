package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Radiation") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 12f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 15.4641f)
                arcToRelative(4f, 4f, 0f, false, true, -4f, 0f)
                lineTo(7.52786f, 19.74597f)
                arcTo(1f, 1f, 0f, false, false, 7.99303f, 21.16211f)
                arcTo(10f, 10f, 0f, false, false, 16.00697f, 21.16211f)
                arcTo(1f, 1f, 0f, false, false, 16.47214f, 19.74597f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 12f)
                arcToRelative(4f, 4f, 0f, false, false, -2f, -3.464f)
                lineToRelative(2.472f, -4.282f)
                arcToRelative(1f, 1f, 0f, false, true, 1.46f, -.305f)
                arcToRelative(10f, 10f, 0f, false, true, 4.006f, 6.94f)
                arcTo(1f, 1f, 0f, false, true, 21f, 12f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 12f)
                arcToRelative(4f, 4f, 0f, false, true, 2f, -3.464f)
                lineTo(7.528f, 4.254f)
                arcToRelative(1f, 1f, 0f, false, false, -1.46f, -.305f)
                arcToRelative(10f, 10f, 0f, false, false, -4.006f, 6.94f)
                arcTo(1f, 1f, 0f, false, false, 3f, 12f)
                close()
            }
}

public val LucideIcons.All.RadiationDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Radiation: ImageVector
    @Composable get() = RadiationDefinition.asImageVector()
