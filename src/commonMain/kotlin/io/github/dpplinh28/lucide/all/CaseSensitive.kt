package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CaseSensitive") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(2f, 16f)
                lineToRelative(4.039f, -9.69f)
                arcToRelative(.5f, .5f, 0f, false, true, .923f, 0f)
                lineTo(11f, 16f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 9f)
                verticalLineToRelative(7f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.304f, 13f)
                horizontalLineToRelative(6.392f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f, 12.5f)
                arcToRelative(3.5f, 3.5f, 0f, true, false, 7.0f, 0f)
                arcToRelative(3.5f, 3.5f, 0f, true, false, -7.0f, 0f)
            }
}

public val LucideIcons.All.CaseSensitiveDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CaseSensitive: ImageVector
    @Composable get() = CaseSensitiveDefinition.asImageVector()
