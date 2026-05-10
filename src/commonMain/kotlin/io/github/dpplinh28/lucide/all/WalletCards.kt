package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("WalletCards") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0f, 3.0f)
                horizontalLineToRelative(14.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, 0.0f)
                horizontalLineToRelative(-14.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, -0.0f)
                verticalLineToRelative(-18.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, -0.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 9f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(14f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 11f)
                horizontalLineToRelative(3f)
                curveToRelative(.8f, 0f, 1.6f, .3f, 2.1f, .9f)
                lineToRelative(1.1f, .9f)
                curveToRelative(1.6f, 1.6f, 4.1f, 1.6f, 5.7f, 0f)
                lineToRelative(1.1f, -.9f)
                curveToRelative(.5f, -.5f, 1.3f, -.9f, 2.1f, -.9f)
                horizontalLineTo(21f)
            }
}

public val LucideIcons.All.WalletCardsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.WalletCards: ImageVector
    @Composable get() = WalletCardsDefinition.asImageVector()
