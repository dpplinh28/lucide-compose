package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Transgender") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 16f)
                verticalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 20f)
                horizontalLineToRelative(-4f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 2f)
                lineToRelative(7.17f, 7.17f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 5.355f)
                verticalLineTo(2f)
                horizontalLineToRelative(3.357f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(22f, 2f)
                lineToRelative(-7.17f, 7.17f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 5f)
                lineTo(5f, 8f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f, 12.0f)
                arcToRelative(4.0f, 4.0f, 0f, true, false, 8.0f, 0f)
                arcToRelative(4.0f, 4.0f, 0f, true, false, -8.0f, 0f)
            }
}

public val LucideIcons.All.TransgenderDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Transgender: ImageVector
    @Composable get() = TransgenderDefinition.asImageVector()
