package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Rabbit") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13f, 16f)
                arcToRelative(3f, 3f, 0f, false, true, 2.24f, 5f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 12f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 21f)
                horizontalLineToRelative(-8f)
                arcToRelative(4f, 4f, 0f, false, true, -4f, -4f)
                arcToRelative(7f, 7f, 0f, false, true, 7f, -7f)
                horizontalLineToRelative(.2f)
                lineTo(9.6f, 6.4f)
                arcToRelative(1f, 1f, 0f, true, true, 2.8f, -2.8f)
                lineTo(15.8f, 7f)
                horizontalLineToRelative(.2f)
                curveToRelative(3.3f, 0f, 6f, 2.7f, 6f, 6f)
                verticalLineToRelative(1f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineToRelative(-1f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, 3f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 8.54f)
                verticalLineTo(4f)
                arcToRelative(2f, 2f, 0f, true, false, -4f, 0f)
                verticalLineToRelative(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.612f, 12.524f)
                arcToRelative(3f, 3f, 0f, true, false, -1.6f, 4.3f)
            }
}

public val LucideIcons.All.RabbitDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Rabbit: ImageVector
    @Composable get() = RabbitDefinition.asImageVector()
