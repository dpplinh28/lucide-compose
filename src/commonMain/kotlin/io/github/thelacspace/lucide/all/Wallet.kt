package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Wallet") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(19f, 7f)
                verticalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, false, 0f, 4f)
                horizontalLineToRelative(15f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-3f)
                arcToRelative(2f, 2f, 0f, false, false, 0f, 4f)
                horizontalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 5f)
                verticalLineToRelative(14f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(15f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineToRelative(-4f)
            }
}

public val LucideIcons.All.WalletDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Wallet: ImageVector
    @Composable get() = WalletDefinition.asImageVector()
