package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SignalMedium") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2f, 20f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 20f)
                verticalLineToRelative(-4f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 20f)
                verticalLineToRelative(-8f)
            }
}

public val LucideIcons.All.SignalMediumDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SignalMedium: ImageVector
    @Composable get() = SignalMediumDefinition.asImageVector()
