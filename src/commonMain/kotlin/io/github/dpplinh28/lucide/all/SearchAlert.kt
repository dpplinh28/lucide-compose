package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SearchAlert") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0f, 11.0f)
                arcToRelative(8.0f, 8.0f, 0f, true, false, 16.0f, 0f)
                arcToRelative(8.0f, 8.0f, 0f, true, false, -16.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(21f, 21f)
                lineToRelative(-4.3f, -4.3f)
            }
            lucidePath(strokeWidth) {
                moveTo(11f, 7f)
                verticalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(11f, 15f)
                horizontalLineToRelative(.01f)
            }
}

public val LucideIcons.All.SearchAlertDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SearchAlert: ImageVector
    @Composable get() = SearchAlertDefinition.asImageVector()
