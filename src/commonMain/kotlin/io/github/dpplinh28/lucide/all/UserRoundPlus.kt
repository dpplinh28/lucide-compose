package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("UserRoundPlus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2f, 21f)
                arcToRelative(8f, 8f, 0f, false, true, 13.292f, -6f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f, 8.0f)
                arcToRelative(5.0f, 5.0f, 0f, true, false, 10.0f, 0f)
                arcToRelative(5.0f, 5.0f, 0f, true, false, -10.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 16f)
                verticalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 19f)
                horizontalLineToRelative(-6f)
            }
}

public val LucideIcons.All.UserRoundPlusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.UserRoundPlus: ImageVector
    @Composable get() = UserRoundPlusDefinition.asImageVector()
